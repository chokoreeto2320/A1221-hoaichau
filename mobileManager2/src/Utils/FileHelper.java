package MoblieManager.Utils;

import MoblieManager.Models.Mobile;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHelper {
        public List<String> read(String path){
            List result = new ArrayList<String>();
            try(BufferedReader reader = new BufferedReader(new FileReader(path))){
                String line;

                while ((line = reader.readLine()) != null) {
                    if(!line.isEmpty()){
                        result.add(line);
                    }
                }
            }
            catch (IOException e) {
                e.printStackTrace();
            }

            return result;
        }

        public void write(String path, List<Mobile> mobiles, boolean isAppend){
            try(BufferedWriter write = new BufferedWriter(new FileWriter(path, isAppend))) {
                for (Mobile p : mobiles){
                    write.write(p.toString());
                    write.newLine();
                }
            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
}
