
public class oop4 {
	// �߻� Ŭ���� �� �޼ҵ� abstract
	public static void main(String[] args) {
		ab_2 ab = new ab_2();
		System.out.println(ab.b());
		ab.ab_a();
	}

}

abstract class ab_1 { // �߻�Ŭ����(��Ʈ��� �θ��⵵��) : �ܺο��� �ε尡 ���� �ȵ� / ��ü ���� xx

	public void ab_a() { // free (�μ��� ���� �߻� �޼ҵ�)
		// <<ȯ�漳���� �� ����. ���ö� �������� �� �޼ҵ�� �÷� �� ���� ����
		// abstract�� ���� ���� : �ڵ带 ����ȭ��Ű�� ����. Ư�� ����� �� �� �޼ҵ�� ����Ѵ�~ �̷� ����
	}

	public void ab_a(int a) { // free(�μ����޴� �߻� �޼ҵ�)
	}
	public abstract void ab_c(); //abstract�� ���� ������ {}��� ;�� �� �� ����
	public abstract int b(); // �߻� �޼ҵ� - ��ü ���� �� ��
	// �� free �����ε� �̷��� �����ϴ� ���� �� ����ϴٴ°�

	public abstract int c(); // <<�̰� ������ main method���� �����Ҷ� ������
}

class ab_2 extends ab_1 {
	@Override
	public void ab_a() {
		System.out.println(this.c());
	}
	@Override
	public void ab_a(int a) {
		
	}
	@Override
	public int b() { // ���� �޼ҵ� + �߻� �޼ҵ�
		// �̷��� b�� ������ ������ �����
		return 55;
	}

	@Override
	public int c() {
		return 99;
	}
	@Override
	public void ab_c() {
		// �̰� ����� ���� �ٽ� ���� ������ �� �� ���� �� �׷��ϱ� ���� ������ �� �� ������ ����� �ؾ�.. �ٵ� �۵� �ȵǴ°� �ƴ�
		// ������ �����ϰ� �� �Ἥ �� �� �� ����? �ΰ��� �� ���� �߸� ���� �ƴѰ��� 
		// �׸��� ���� ���� �Ҷ� ���� �Ѵ� ��	
	}
}