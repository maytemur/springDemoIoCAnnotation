package com.springdemo;

public class CustomerManager implements ICustomerService {

	private ICustomerDal musteriDal;

	/* "Constructor Injection"
	 * ICUstomerDal türünde bir customerDal oluşturuyorum, dışarıdan erişimi
	 * engellemek için private yaptık.Daha sonra contextMenu(MouseSağ Menu)-Source
	 * dan generate Constructor using fields diyince aşağıdaki public
	 * CustomerManager class'ını eclipse oluşturuyor.Bu ise CustomerManager
	 * constructor'ında bir customerDal istiyor demek oldu.
	 */
	// Sektörde buna "Constructor Injection" deniyor constructor args ile yaptık
	// genelde bu kullanılıyor
	// birde setter Injection denilen bir tür var -önerilmiyor

	public CustomerManager(ICustomerDal musteriDal) { // super(); süper silinebilir
		this.musteriDal = musteriDal;
	}

	public void add() {
		// CustomerDal customerDal= new CustomerDal();
		//iş kuralları
		musteriDal.add();
	}

}