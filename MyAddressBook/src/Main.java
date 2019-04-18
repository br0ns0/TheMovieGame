public class Main {

    public static void main(String[] args) {
        ContactManager contactManager = new ContactManager();

        //create first contact object
        Contact brother = new Contact();
        // set fields ==> name  |  email | phone
        brother.name = "Vaughn";
        brother.email = "@gmail";
        brother.phone = "805362621";
        // add brother to addressBook!
        contactManager.addContact(brother);

        //create second contact object
        Contact motherGoose = new Contact();
        motherGoose.name = "Laurel";
        motherGoose.email = "@hotmail";
        motherGoose.phone = "8056172534";
        contactManager.addContact(motherGoose);

        //create third contact object
        Contact Dad = new Contact();
        Dad.name = "Bob";
        Dad.email = "@sbcc.edu";
        Dad.phone = "766367367";
        contactManager.addContact(Dad);

         Contact result = contactManager.searchContact("Vaughn");
         System.out.println(result.name);


    }



}

