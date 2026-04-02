class Product{
	
	    int productId;
    String productName;
    String companyName;
    double mfDate;
    double expDate;
    Type type;
    double price;
    double weight;

    Product(int productId, String productName, String companyName,
          double mfDate, double expDate, Type type,
          double price, double weight) {

        this.productId = productId;
        this.productName = productName;
        this.companyName = companyName;
        this.mfDate = mfDate;
        this.expDate = expDate;
        this.type = type;
        this.price = price;
        this.weight = weight;
    }
	
	
	Product[] product;
	int currentIndex=0;
	
	   Product() {
        product = new Product[10]; 
    }

	
	void addProduct(Product products)
	{
		int index= product.length;
		if(products!=null)
		{
			if(currentIndex<index)
			{
				product[currentIndex]=products;
				currentIndex++;
				System.out.println("product is added:"+products.productName);
				System.out.println("product is added with index:"+currentIndex);
				
			}
		}
		
		else{
			
			System.out.println("Array is full");
		}
	}
	
	void getProductNameByProductId(int productId)
	{
		
		boolean found=false;
		
		if(product!=null)
		{
			for(Product p : product)
			{
				
				if(p!=null &&  p.productId==productId)
				{
					
					System.out.println("product is found");
					System.out.println("product name :"+p.productName);
					System.out.println("product id :"+p.productId);
					found= true;
					break;
					
				}
			}
				
	}
	if(!found){
		System.out.println("product not found");
	}
	}
	
	void getPriceByProductName(String productName)
	{
		boolean found=false;
		if(product!=null)
		{
			for(Product p: product)
			{
				if(p!=null && p.productName==productName)
				{
						System.out.println("product is found");
					System.out.println("product name :"+p.productName);
					System.out.println("product price :"+p.price);
					found= true;
					break;
				}
				
			}
			
		}
		
		if(!found){
			System.out.println("product not found");
		}
		
	}
	
	void getProductNameByCompanyName(String companyName)
	{
		boolean found=false;
		
		if(product!=null)
		{
			for(Product p : product)
			{
				if(p!=null && p.companyName.equals(companyName))
				{
					
						System.out.println("product is found");
					System.out.println("product name :"+p.productName);
					System.out.println("Company name :"+p.companyName);
					found= true;
					break;
					
				}
					
			}
			
		}
		if(!found){
			System.out.println("product not found");
		}
		
		
	}
	
	void updateByCompanyName(String companyName,String newCompanyName)
	{
		boolean found=false;
		if(product!=null)
		{
			for(Product p: product)
			{
				if(p!=null && p.companyName.equals(companyName))
				{
					p.companyName=newCompanyName;
					
					
						System.out.println("product is found");
					System.out.println(" updated companyName:"+p.companyName);
					found=true;
					break;
				}
			}
			
		}
	if(!found)
		{
			System.out.println("company name not updated");
		}
		
	}
	
void deleteByProductName(String productName)
{
    boolean found=false;
    
    if(product!=null)
    {
        for(int i=0;i<currentIndex;i++)
        {
            if(product[i]!=null && product[i].productName.equals(productName))
            {
                String deletedName = product[i].productName;

                product[i]=null;

                System.out.println("product is deleted");
                System.out.println("deleted productName:"+deletedName);

                found=true;
                break;
            }
        }
    }

    if(!found)
    {
        System.out.println("product name not deleted");
    }
}

		
}