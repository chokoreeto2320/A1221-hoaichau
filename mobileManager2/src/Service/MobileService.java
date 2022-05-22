package MoblieManager.Service;

import MoblieManager.Models.AuthenticMobile;
import MoblieManager.Models.HandCarriedMobile;
import MoblieManager.Models.Mobile;
import MoblieManager.Utils.Constant;
import MoblieManager.Utils.FileHelper;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MobileService {
    private static List<Mobile> mobileList = new ArrayList<>();
    static FileHelper fileHelper = new FileHelper();

    public MobileService(){
        mobileList = mapToMobiles();
    }

    public void add(Mobile mobile) {
        int lastId = 0;
        if (mobileList.size() > 0) {
            lastId = mobileList.get(mobileList.size() - 1).getId();
        }

        mobile.setId(lastId + 1);
        mobileList.add(mobile);
        fileHelper.write(Constant.path, Collections.singletonList(mobile), true);
    }

    private List mapToMobiles() {
        List result = new ArrayList();

        List<String> lines = fileHelper.read(Constant.path);
        for (String line : lines) {
            String[] tmp = line.split(",");
            String type = tmp[0];
            int id = Integer.parseInt(tmp[1]);
            String name = tmp[2];
            Double price = Double.parseDouble(tmp[3]);
            String manufacturer = tmp[4];

            if (tmp[0].equals("Authentic Mobile")) {
                int warrantyPeriod = Integer.parseInt(tmp[5]);
                int warrantyCode = Integer.parseInt(tmp[6]);

                result.add(new AuthenticMobile(type, id, name, price, manufacturer, warrantyPeriod, warrantyCode));
            } else {
                String nation = tmp[4];
                String status = tmp[5];
                result.add(new HandCarriedMobile(type, id, name, price, manufacturer, nation, status));
            }
        }
        return result;
    }

    public static List<Mobile> findAll(){
        return mobileList;
    }

    public static void delete(int id){
        for (int i = 0; i < mobileList.size(); i++) {
            if(mobileList.get(i).getId() == id){
                mobileList.remove(i);
                fileHelper.write(Constant.path, mobileList, false);
                return;
            }
        }
    }

    public static List searchByName(String name){
        List result = new ArrayList();

        for (int i = 0; i < mobileList.size(); i++) {
            if(mobileList.get(i).getName().contains(name)){
                result.add(mobileList.get(i));
            }
        }

        return result;
    }
}
