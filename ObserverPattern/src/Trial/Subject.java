package Trial;

public interface Subject {
	// ע��۲���
	public void registerObserver(Observer o);

	// �Ƴ��۲���
	public void removeObserver(Observer o);

	// ֪ͨ�۲���
	public void notifyObservers();
}
