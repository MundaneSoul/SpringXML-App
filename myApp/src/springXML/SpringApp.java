package springXML;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import springXML.beans.Item;

public class SpringApp {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        Item firstItem = context.getBean("myItem", Item.class);

        System.out.println(firstItem);

        System.out.println(firstItem.getItemName());
        System.out.println(firstItem.getItemPrice());
        System.out.println(firstItem.getItemDescription());

        context.close();
    }
}
