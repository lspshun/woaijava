package �̳�;

// �̳и����������Ϊ,ʹ���������и����ʵ����ͷ���
// java ͨ��extends�ؼ�������һ���������һ����̳й�����
public class Penguin {
	private String name;
	private int id;

	public Penguin(String myName, int myId) {
		name = myName;
		id = myId;
	}

	public void eat() {
		System.out.println(name + "�Է�");
	}

	public void sleep() {
		System.out.println(name + "˯��");

	}

	public void introduction() {
		System.out.println("��Һ�!����" + id + name + ",");
	}
}
