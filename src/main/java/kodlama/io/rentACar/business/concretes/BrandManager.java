package kodlama.io.rentACar.business.concretes;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import kodlama.io.rentACar.business.abstracts.BrandService;
import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.dataAccess.abstracts.BrandRepository;
import kodlama.io.rentACar.entities.Brand;


@Service
public class BrandManager implements BrandService {
	
	private BrandRepository brandRepository;
	
	
	public BrandManager(BrandRepository brandRepository) {	
		this.brandRepository = brandRepository;
	}


	@Override
	public List<GetAllBrandsResponse> getAll() {
		
		List<Brand> brands=brandRepository.findAll();
		List<GetAllBrandsResponse> brandsResponse=new ArrayList<GetAllBrandsResponse>();
			
			for(Brand brand: brands) {
			GetAllBrandsResponse responseItem= new GetAllBrandsResponse();
			responseItem.setId(brand.getId());
			responseItem.setName(brand.getName());
			brandsResponse.add(responseItem);
		
			}
			return brandsResponse;
		
	}

}
