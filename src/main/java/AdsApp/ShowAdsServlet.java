//package AdsApp;
//
//import AdsApp.Ad;
//import AdsApp.Ads;
//import AdsApp.DaoFactory;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//import java.util.List;
//
//
//@WebServlet("/ads")
//public class ShowAdsServlet extends HttpServlet {
//    @Override
//    protected void doGet(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
//        Ads AdsDao = DaoFactory.getAdsDao();
//
//        List<Ad> Ads = AdsDao.all();
////
//        request.setAttribute("Ads", Ads);
//        request.getRequestDispatcher("/ads/index.jsp").forward(request, resp);
//    }
//}