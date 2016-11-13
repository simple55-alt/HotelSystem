package test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

import logiccontroller.HotelController;
import mock.MockClient1;
import mock.MockHotel1;
import objects.AccommodationInfo;
import objects.Hotel;
import objects.HotelWorker;
import objects.ResultMessage;
import objects.Room;
import vo.HotelVO;

public class Hoteltest {
	HotelController hotelContro = new HotelController();
	@Test
	public void testhotel_checkInfo(){
		HotelVO hotelVO = hotelContro.hotel_checkInfo(1);
		HotelVO testHotel = new HotelVO("鍗椾含","鏂拌鍙�", "濡傚", "濡傚閰掑簵", "閰掑簵鎵�鏈夋湇鍔�", "鍙敤", "鍙屼汉鎴�", 1, 100, "", "good");
		
		assertEquals(testHotel,hotelVO);
	}
	
	@Test
	public void testhotel_updateInfo(){
		HotelVO testHotel = new HotelVO("鍗椾含","浠欐灄涓績", "濡傚", "濡傚閰掑簵", "閰掑簵鎵�鏈夋湇鍔�", "鍙敤", "鍙屼汉鎴�", 1, 100, "", "good");
		assertEquals(ResultMessage.Success,hotelContro.hotel_updateInfo(testHotel));
	}
	
	@Test
	public void testhotel_importRoom(){
		Room importRoom = new Room("鍙屼汉鎴�","220",5,"2016-10-11","2016-11-1");
		assertEquals(ResultMessage.Success,hotelContro.hotel_importRoom(importRoom));
	}
	
	@Test
	public void testhotel_updateAccomodation(){
		AccommodationInfo info = new AccommodationInfo("201","2016-10-11","2016-11-03","2016_11-04");
		assertEquals(ResultMessage.Success,hotelContro.hotel_updateAccomodation(info));
	}
	
	@Test
	public void testsearchHotel(){
		Hotel hotel = new Hotel();
		MockHotel1 hotel1 = new MockHotel1(1);
		assertEquals(hotel,hotelContro.searchHotel(hotel1.getHotelid()));
	}
	
	@Test
	public void testpreviousHotel(){
		ArrayList<Hotel> HotelList_Client=new ArrayList<Hotel>();
		Hotel hotel=new Hotel();
		HotelList_Client.add(hotel);
		MockClient1 client = new MockClient1(2);
		assertEquals(HotelList_Client,hotelContro.previousHotel(client.getClientid()));
	}
	
	@Test
	public void testaddHotel(){
		Hotel hotel = new Hotel();
		assertEquals(ResultMessage.Success,hotelContro.addHotel(hotel));
	}
	
	@Test
	public void testaddHotelWorker(){
		HotelWorker worker = new HotelWorker("寮犱笁","10000","濡傚");
		assertEquals(ResultMessage.Success,hotelContro.addHotelWorker(worker));
	}
	
	@Test
	public void testsearchHotelWorker(){
		HotelWorker worker = new HotelWorker("寮犱笁","10000","濡傚");
		assertEquals(worker,hotelContro.searchHotelWorker(1));
	}
	
	@Test
	public void testupdateHotelWokerInfo(){
		HotelWorker worker = new HotelWorker("寮犱笁","10110","濡傚");
		assertEquals(ResultMessage.Success,hotelContro.updateHotelWokerInfo(1, worker));
	}
}

