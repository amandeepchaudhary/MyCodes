//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//REVISE ARRAYS
//ANd see how he will add arrays and use arrays

package com.CodeWithAman;

class Library{
    String name;
    int addBooks;
    int ib;
    int tib=0;
    private Library[] availableBooks;


    void setAvailableBooks(Library[] availableBooks){
        this.availableBooks=availableBooks;
        this.availableBooks= new Library[1000];
    }

    public Library[] getAvailableBooks() {
        return availableBooks;
    }
    int tba=1000;
    int rb;
    int trb=0;
    int notspecified=0;


//    void notspecified(){
//        System.out.println("the number of issued books are greater than available books ");
//    }
    int getIb(){
        boolean b = ib <= tba;
        if (b){
            return ib;
        }else {
            System.out.println(false);
        }
        return notspecified;
    }

    void setRb(int rb){
        System.out.println("Returned books are: "+rb);
        this.rb=rb;
        trb=trb+rb;
        tba= tba+rb;

    }
    void issuedBooks(int ib){
        System.out.println("The books issued from available books : "+ib);
        this.ib=ib;
        tib=tib+ib;
        tba=tba-tib;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAddBooks() {
        return addBooks;
    }

    public void setAddBooks(int addBooks) {
        this.addBooks = addBooks;
        tba= tba +addBooks;
    }
    public int getTba(){
        System.out.println("Total books added till now and Available:");
        return tba;
    }
    public int getTib(){
        System.out.println("Total issued books till now:");
        return tib;
    }
    public int getTrb(){
        System.out.println("Total returned books till now:");
        return trb;
    }

}
public class Exercise4_onlineLibraray_51 {
    public static void main(String[] args) {
        Library ref= new Library();
        ref.setName("aman");
        System.out.println(ref.getName());
        ref.setAddBooks(43);
        System.out.println(ref.getAddBooks());
        ref.setAddBooks(57);
        System.out.println(ref.getTba());
        ref.issuedBooks(4);
        System.out.println(ref.getTba());
        ref.issuedBooks(1097);
        System.out.println(ref.getTba());







    }
}
