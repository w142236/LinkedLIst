/* Type code here. */
import java.util.*;  
public class SongEntry {

   protected LinkedList<SongEntry> Node;
   
   private String uniqueID ;
   private String songName;
   private String artistName;
   private int songLength;
   private SongEntry nextNode;
   
   public SongEntry() {
	   uniqueID = "none";
	   songName = "none";
	   artistName = "none";
	   songLength = 0;
	   nextNode = null;
   }
   public SongEntry(String ID, String Song, String artist, int trackLength, SongEntry nextNodePtr) {
      uniqueID = ID;
      songName = Song;
      artistName = artist;
      songLength = trackLength;
      nextNode = nextNodePtr;
      
   }
   public SongEntry(String ID, String Song, String artist, int trackLength) {
	//TODO Auto-generated constructor stub
	   uniqueID = ID;
	   songName = Song;
	   artistName = artist;
	   songLength = trackLength;
	   nextNode = null;
	      
}
public void insertAfter(SongEntry currNode) {
	   SongEntry tmpNext;

	   tmpNext = nextNode;//temp = current Song
	      nextNode = currNode;// current song = 
	      currNode.nextNode = tmpNext;
   }
   public void setNext(SongEntry nextNode) {
	   this.nextNode = nextNode;
   }
   //######################################ACCESSORS########################################################
   public String getID() {//- Accessor
	   return nextNode.uniqueID;
	   
   }
   public String getSongName() {// - Accessor
	   return songName;
   }
   public String getArtistName() {// - Accessor
	   return artistName;
   }
   public int getSongLength() {// - Accessor
	   return songLength;
   }
   public SongEntry getNext() {// - Accessor
	   return nextNode;
   }
   public int length(SongEntry head) {
	   if (head == null) {
		   return 0;
	   }
	   int count = 0;
	   SongEntry current = head;
	   while(current!=null) {
		   count++;
		   //move to next node
		   current = current.nextNode;
	   }
	   return count;
   }
   public SongEntry removeEntry(SongEntry head, int position) {
	   int size = length(head);
	   if(position > size || position < 1) {
		   System.out.println("Invalid position");
		   return head;
	   }
	   if(position == 1) {
		   SongEntry temp = head;
		   head = head.nextNode;
		   temp.nextNode = null;
		   return temp;
	   }else {
			   SongEntry previous = head;
			   int count = 1;
			   while(count < position - 1) {
				   previous = previous.nextNode;
				   count++;
			   }
			   SongEntry current = previous.nextNode;
			   previous.nextNode = current.nextNode;
			   current.nextNode = null;
			   return current;
		   }
	   }
   
   public void printPlaylistSongs() {
	if(!uniqueID.equals("none"))
		System.out.println("Unique ID: " + uniqueID + "\nSong Name: " + songName + "\nArtist Name: " + artistName
        + "\nSong Length (in seconds): " + songLength + "\n");   
   }
   //#########################################################################################################
   
}       


