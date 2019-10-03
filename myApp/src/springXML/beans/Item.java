package springXML.beans;

public class Item {
    private String itemName;
    public String itemPrice;
    public String itemDescription;

    private void startMyBean() {
        System.out.println("UserLoginStatus: Starting up");
    }

    private void killMyBean() {
        System.out.println("UserLoginStatus: Shutting down");
    }

    public String getItemName(){return itemName;}
    public void setItemName(String itemName) { this.itemName = itemName;

    }
    public String getItemPrice(){return itemPrice;}
    public void setItemPrice(String itemPrice) {this.itemPrice = itemPrice;
    }
    public String getItemDescription(){return itemDescription;}
    public void setItemDescription(String itemDescription) { this.itemDescription = itemDescription;
    }


}
