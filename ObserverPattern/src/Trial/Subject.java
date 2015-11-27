package Trial;

public interface Subject {
	// 注册观察者
	public void registerObserver(Observer o);

	// 移除观察者
	public void removeObserver(Observer o);

	// 通知观察者
	public void notifyObservers();
}
