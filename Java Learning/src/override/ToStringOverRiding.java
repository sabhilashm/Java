package override;



public class ToStringOverRiding {

 
		String brand;
		String color;
		int Price;
		
		public ToStringOverRiding(String brand,String color,int Price)
		{
			this.brand=brand;
			this.color=color;
			this.Price=Price;
			
		}
		
		@Override
		public String toString()
		{
			return brand+color+Price;
		}

	

}
