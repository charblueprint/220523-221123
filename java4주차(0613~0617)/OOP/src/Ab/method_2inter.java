package Ab;
//interface : �޼ҵ常 ����, �߰��� ������ ó���ϴ� ������ default�� ������ �ö󰡸� �߰���
public interface method_2inter {
	//abstract�� Ŭ������ interface�� �޼ҵ��
	//interface�� �޼ҵ��̹Ƿ� �ʵ忡 �ڷ����� ������ �� ����
	public String names();// String names() return�޼ҵ� ����
	default void setbox(String name) {	// setter
		System.out.println(name);
	}
	default String box3() { //getter
		// interface���� default�� �����ϸ� ����޼ҵ带 �����.
		return null;
	}
}
interface method_2re extends method_2inter { //interface�� extends�� �θ� interface�� �ε��� �� �ֽ��ϴ�.
	//�ٵ� ���⿡���� implement�� �ȵȴٴ� ��!
	//���� �̷��Ŵ� ��ɱ��� �� �ߴµ� �ɼ��� �߰��� ���������� �׳� �ű⿡ �� ���̴� ��
}