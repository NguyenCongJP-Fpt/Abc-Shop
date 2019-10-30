package example;

import entity.Product;
import org.hibernate.Session;
import service.ProductService;
import util.HibernateUtil;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.xml.ws.Endpoint;

@WebService()
public class HelloWorld {
    public static void main(String[] argv) {
        Endpoint.publish("http://localhost:9000/product-service", new ProductService());
    }
}
