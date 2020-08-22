package backend;


import entity.CPU;
import entity.Car;

public class InnerClass {

	public void question1() {

		CPU cpu = new CPU(350);
		CPU.Ram ram = cpu.new Ram(8, "1600");
		CPU.Processor processor = cpu.new Processor(3, "intel");

		System.out.println(ram.getClockSpeed());
		
		System.out.println(processor.getCache());
	}
	
	public void question2() {
		
		Car car = new Car("Mazda", "8WD");
		Car.Engine engine = car.new Engine("Crysler");
		
		System.out.println("Thông tin động cơ : "+engine.getEngineType());
		
	}
}
