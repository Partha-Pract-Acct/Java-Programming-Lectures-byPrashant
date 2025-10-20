/*
Start with a base class LibraryItem that includes common attributes like itemID, title, and author, and
methods like checkout() and returnItem(). Create subclasses such as Book, Magazine, and DVD,
each inheriting from LibraryItem. Add unique attributes to each subclass, like ISBN for Book, issueNumber for Magazine,
and duration for DVD
 */

package in.coding.challenge77;

public class LibraryItems {
    private String itemId;
    private String title;
    private String author;

    public void checkout() {
        System.out.println("Checkout");
    }

    public void returnItems() {
        System.out.println("Returning the item");
    }
}
