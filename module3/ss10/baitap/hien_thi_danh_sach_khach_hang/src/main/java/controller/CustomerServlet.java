package controller;

import model.Customer;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "CustomerServlet", value = "/CustomerServlet")
public class CustomerServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Customer> customerList=new ArrayList<>();
        customerList.add(new Customer("mai","25/01/2000","Hà Nội","https://binhminhdigital.com/StoreData/PageData/3429/Tim-hieu-ve-ban-quyen-hinh-anh%20(3).jpg"));
        customerList.add(new Customer("văn","02/11/2000","Đà Nẵng","https://photo-cms-viettimes.zadn.vn/666x374/Uploaded/2021/haovna/2017_07_15/k_zgic.jpg"));
        customerList.add(new Customer("phước","27/02/2001","US","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSdhh3sTKCfNoxXND9CQVERW39d9JVUU9-bWgGQEDto4vQO37iBRtX9_JYbCLkBca8U8Pc&usqp=CAU"));
        customerList.add(new Customer("hà","16/08/2000","UK","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTuiKO8EvIRN1LFBoqpHSJlhcgKmmr3DDfTMP0P2hj02JHqnNhc5nrMiCvJXvC3emjVX6c&usqp=CAU"));
        request.setAttribute("customerListServlet",customerList);
        request.getRequestDispatcher("index.jsp").forward(request,response);

    }
}
