package AssignmentSet5;

class Room{
	private int roomNo;
	private static int capcity;
	private static int roomCounter;
	
	static {
		roomCounter = 500;
		capcity = 4;
	}
	
	public Room(){
		this.roomNo = Room.roomCounter;
	}
	
	public int getRoomNo() {
		return roomNo;
	}
	
	public static int getCapcity() {
		return capcity;
	}
	
	public static void setCapcity(int capcity) {
		Room.capcity = capcity;
	}
	
	public static int getRoomCounter() {
		return roomCounter;
	}
	
	public static void setRoomCounter(int roomCounter) {
		Room.roomCounter = roomCounter;
	}	
}

class Member{
	private int memberId;
	private String name;
	private Room room;
	
	public Member( int memberId, String name) {
		this.memberId = memberId;
		this.name = name;
	}
	
	public int getMemberId() {
		return memberId;
	}

	public void setMemberId(int memberId) {
		this.memberId = memberId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Room getRoom() {
		return room;
	}

	public void setRoom(Room room) {
		this.room = room;
	}
}

class Admin{
	public void assignRoom(Room rooms[], Member member) {
		int i = 0;
		if(rooms[i].getCapcity()>0) {
			member.setRoom(rooms[i]);
			rooms[i].setCapcity(rooms[i].getCapcity()-1);
		}else {
			i+=1;
			member.setRoom(rooms[i]);
			rooms[i].setCapcity(rooms[i].getCapcity()-1);
		}
	}
}

public class Assignment3 {
	public static void main(String args[]) {
		Room room1 = new Room();
		Room room2 = new Room();
		Room room3 = new Room();
		Room room4 = new Room();
		Room room5 = new Room();

		Room[] totalRooms = { room1, room2, room3, room4, room5 };

		Admin admin = new Admin();

		Member member1 = new Member(101, "Serena");
		Member member2 = new Member(102, "Martha");
		Member member3 = new Member(103, "Nia");
		Member member4 = new Member(104, "Maria");
		Member member5 = new Member(105, "Eva");
		
		Member[] members = { member1, member2, member3, member4, member5 };
		
		for (Member member : members) {
			admin.assignRoom(totalRooms, member);
			if(member.getRoom()!=null) {
				System.out.println("Hi "+member.getName()+"! Your room number is "+member.getRoom().getRoomNo());
			}
			else {
				System.out.println("Hi "+member.getName()+"! No room available");
			}
		}
	}
}
