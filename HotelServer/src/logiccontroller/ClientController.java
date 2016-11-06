package logiccontroller;

import java.util.ArrayList;

import Objects.Evaluation;
import Objects.RoomType;
import Objects.VIPInfo;
import VO.ClientVO;
import VO.HotelVO;
import businesslogicsevice.ClientBLService;
import businesslogicsevice.ResultMessage;

public class ClientController implements ClientBLService{
	//�ͻ���Ϣ
		String client_name="����";
		String contact="11111111111";
		int credit=0;
		String credit_record="��";
		int memberid=000001;
		String member_type="PERSON";
		String birthday="1997-7-1";
		String company="�Ͼ���ѧ";
		
		//�Ƶ���Ϣ
		String address="�Ͼ�";
		String business_address="�½ֿ�";
		String hotel_name="���";
		String introduction="��";
		String service="��";
		String room_state="δԤ��";
		String room_type="˫�˷�";
		int room_number=1;
		int room_price=200;
		String order="��";
		String evaluation="��";
		
	public ClientVO client_checkInfo(int clientid){
		ClientVO client=new ClientVO(client_name,contact,credit,credit_record,memberid,member_type,birthday,company);
		return client;		
	}
	
	public ResultMessage client_updateInfo(ClientVO vo){
		if(vo!=null){
		return ResultMessage.Success;
		}
		else{
			return ResultMessage.Fail;
		}
	}
	
	public ArrayList<HotelVO> client_getpreviousHotelList(int clientid){
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public String client_checkCredit(int clientid) {
		return credit_record;		
	}

	public ArrayList<HotelVO> client_setLocation(String location) {
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public ArrayList<HotelVO> client_searchHotel(String hotelname) {
		ArrayList<HotelVO> HotelList_Client=new ArrayList<HotelVO>();
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		HotelList_Client.add(hotel);
		return HotelList_Client;
	}


	public HotelVO client_checkHotelInfo(int hotelid) {
		HotelVO hotel=new HotelVO(address,business_address,hotel_name,introduction,service,room_state,room_type,room_number,room_price,order,evaluation);
		return hotel;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(RoomType type) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(int lowprice, int highprice) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(String inTime, String leaveTime) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(int star) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ArrayList<HotelVO> client_searchHotel(double lowscore, double highscore) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ResultMessage client_evaluateHotel(Evaluation e, int clientid) {
		// TODO �Զ����ɵķ������
		return null;
	}

	@Override
	public ResultMessage client_enrollVIP(VIPInfo info, int clientid) {
		// TODO �Զ����ɵķ������
		return null;
	}
}