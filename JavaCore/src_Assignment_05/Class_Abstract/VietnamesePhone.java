package Class_Abstract;

public class VietnamesePhone extends Phone{

	public VietnamesePhone() {
	}

	@Override
	public void insertContact(String name, String phone) {
		System.out.println("Insert người dùng :" + name + " Số diện thoại " + phone);
	}

	@Override
	public void removeContact(String name) {
		System.out.println("Xóa người dùng :" + name);
	}

	@Override
	public void updateContact(String name, String newPhone) {
		System.out.println("Sửa người dùng " + name + " Số Mới " + newPhone);
	}

	@Override
	public void searchContact(String name) {
		System.out.println("Tìm người dùng " + name);
	}
}

