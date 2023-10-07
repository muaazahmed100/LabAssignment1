public class Library {
    LibraryItem[] items;
    private int maxItems=100;
    LibraryItem lib;
    LibraryItem[] borrows=new LibraryItem[maxItems];
    LibraryItem store;
    int no=0;
    int b;
    int num=0;

    public void addItem(LibraryItem item){
        if(no<100){
            items[no]=item;
            no+=1;
        }
    }
    public void borrowItem(LibraryItem item){
        int count=0;
        for (int i=0;i<no;i++) {
            if(items[i].equals(item)==true) {
                items[i].setBorrowed(true);
                borrows[count++]=items[i];
                b=i;
            }
        }
    }
//    public void returnItem(LibraryItem item){
//
//        int c=0;
//        for (int i=0;i<c;i++){
//            if(borrows[i]==item) {
//               borrows[i]=null;
//                break;
//            }
//        }
//        items[b]=item;
//        items[b].setBorrowed(false);
//    }

    public void returnItem(LibraryItem item) {
        for (int i = 0; i < borrows.length; i++) {
            if (borrows[i] == item) {
                borrows[i] = null;
                break;
            }
        }

        // Shift the remaining items in the borrows array to fill the gap
        for (int i = 0; i < borrows.length - 1; i++) {
            if (borrows[i] == null) {
                borrows[i] = borrows[i + 1];
                borrows[i + 1] = null;
            }
        }

        // Update the no variable to reflect the return


        // Mark the item as not borrowed in the items array
        item.setBorrowed(false);
    }

    public void displayBorrowedItems(){

        for(int i=0;i<=num;i++) {
            System.out.println(borrows[i]);
        }
    }



    public void displayAvailableItems(){
        for(int i=0;i<no;i++) {
            System.out.println(items[i]);
        }
    }

    Library(){
        items=new LibraryItem[maxItems];
    }
}
