public class ContactNode {
   private String Contact;         // Node data
   private String PhoneNum;
   private ContactNode nextNodePtr; // Reference to the next node

   public ContactNode() {
      Contact = "Jane Doe";
      PhoneNum = "555-555-5555";
      nextNodePtr = null;
   }

   // Constructor
   public ContactNode(String Contact, String PhoneNum) {
      this.Contact = Contact;
      this.PhoneNum = PhoneNum;
      this.nextNodePtr = null;
   }

   // Constructor
   public ContactNode(String Contact, String PhoneNum, ContactNode nextLoc) {
      this.Contact = Contact;
      this.PhoneNum = PhoneNum;
      this.nextNodePtr = nextLoc;
   }

   /* Insert node after this node.
    Before: this -- next
    After:  this -- node -- next
    */
   public void insertAfter(ContactNode nodeLoc) {
      ContactNode tmpNext;
      tmpNext = this.nextNodePtr;
      this.nextNodePtr = nodeLoc;
      nodeLoc.nextNodePtr = tmpNext;
   }

   // Get location pointed by nextNodePtr
   public ContactNode getNext() {
      return this.nextNodePtr;
   }

   public void printContactNode() {
	   if(this.Contact!="Jane Doe" || this.PhoneNum!="555-555-5555") {
	   System.out.println("Name: " + this.Contact +  "\nPhone number: " + this.PhoneNum + "\n");
	   }
   }
   public String getName(){
      return this.Contact;
   }
   public String getPhoneNumber(){
      return this.PhoneNum;
   }
}