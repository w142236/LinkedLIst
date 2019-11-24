import java.util.*;
public class PlayList {
	static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
    SongEntry headSong = null;  // Create intNode objects
    SongEntry currSong = null;
        
        System.out.println("Enter playlist's title:");
        String title = sc.nextLine();
    	System.out.println(title.toUpperCase() + " PLAYLIST MENU");
		System.out.println("a - Add song\r\n" + 
				"d - Remove song\r\n" + 
				"c - Change position of song\r\n" + 
				"s - Output songs by specific artist\r\n" + 
				"t - Output total time of playlist (in seconds)\r\n" + 
				"o - Output full playlist\r\n" + 
				"q - Quit\r\n" + 
				"\r\n" + 
				"Choose an option: ");
		String choice = sc.next().trim();
		while(!choice.equals("q")) {
		if (choice.equals("a")) {
			if(headSong!=null) {
			System.out.println("Enter the Song's Name: ");
			title = sc.next();
			System.out.println("Enter the name of the artist: ");
			String artist = sc.next();
			System.out.println("Enter the name of the album: ");
			String album = sc.next();
			System.out.println("Enter the track length: ");
			int length = sc.nextInt();
			SongEntry oldSong = currSong;//temporary object points to current object on stack
			currSong = new SongEntry(title,artist,album,length);//field variable points to new value created on stack
			oldSong.insertAfter(currSong);
			}else{//"priming the read" of the headNode. 
				System.out.println("Enter the Song's Name: ");
				title = sc.next();
				System.out.println("Enter the name of the artist: ");
				String artist = sc.next();
				System.out.println("Enter the name of the album: ");
				String album = sc.next();
				System.out.println("Enter the track length: ");
				int length = sc.nextInt();
				headSong = new SongEntry();
				SongEntry newSong = new SongEntry(title,artist,album,length);
				currSong = newSong;
				headSong.insertAfter(currSong);
			}
		}else if(choice.equals("o")) {//complete
			currSong = headSong;
	        while(currSong!=null) {
	        	currSong.printPlaylistSongs();
	        	currSong = currSong.getNext();
	        }

		}else if(choice.equals("d")) {//TO DO
			System.out.println("Enter song's unique ID:");
			String id = sc.next();
			SongEntry previousSong = headSong;//traverses node 0 in list
			int count = 1; 
			while(previousSong!=null) {
				if(previousSong.getID().equals(id)) {
					previousSong.removeEntry(headSong, count);
				}
				previousSong = previousSong.getNext();
				count++;
			}
	       
		}else if(choice.equals("c")) {//TO DO
			System.out.println("Enter song's current position:");
			int old_position = sc.nextInt();
			System.out.println("Enter new position for song:");
			int new_position = sc.nextInt();
			//one.ChangePositionOfSong(old_position,new_position);
			/*
			 * Moving the head node 
			   Moving the tail node 
			   Moving a node to the head 
			   Moving a node to the tail 
			   Moving a node up the list 
			   Moving a node down the list  
			 */
			//System.out.println(one.songs[old_position] + "moved to position " + new_position);
		}else if(choice.equals("s")) {//TO DO
			System.out.println("Enter artist's name:");
			//String artistName = sc.next();
			//for(int i = 0; i < one.size();i++) {//Had to use one.size() instead of one.song.length
				//if(one.songs[i].artist.equals(artistName)) {
				//	System.out.println(one.songs[i].name);
				//}
			//}
		}else if(choice.equals("t")) {
			//System.out.println(one.totalTime());
		}else {
		choice = "q";
		}
		System.out.println("a - Add song\r\n" + 
				"d - Remove song\r\n" + 
				"c - Change position of song\r\n" + 
				"s - Output songs by specific artist\r\n" + 
				"t - Output total time of playlist (in seconds)\r\n" + 
				"o - Output full playlist\r\n" + 
				"q - Quit\r\n" + 
				"\r\n" + 
				"Choose an option: ");
		choice = sc.next().trim();
    }

    
    }
}

	

