public class ContactManager {

    private Contact[] myFriends;
    private int friendsCounter;

    public ContactManager() {
        this.friendsCounter = 0;
        this.myFriends = new Contact[500];
    }

    public void addContact(Contact contact) {
        myFriends[friendsCounter] = contact;
        friendsCounter++;
    }

    public Contact searchContact(String searchContact){
        for(int i=0; i<friendsCounter; i++) {
            if (myFriends[i].name.equals(searchContact)){
                return myFriends[i];
            }
        }
        return  null;
    }




}
