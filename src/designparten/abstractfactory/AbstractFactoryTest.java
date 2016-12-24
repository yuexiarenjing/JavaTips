package designparten.abstractfactory;

public class AbstractFactoryTest {
	public static void main(String[] args) {
		Provider provider = new SendMailFactory();
		Sender sender = provider.produce();
		sender.Send();
	}
}
