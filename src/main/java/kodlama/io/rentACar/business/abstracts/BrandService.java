package kodlama.io.rentACar.business.abstracts;

import java.util.List;

import kodlama.io.rentACar.business.responses.GetAllBrandsResponse;
import kodlama.io.rentACar.entities.Brand;

public interface BrandService {
	List<GetAllBrandsResponse> getAll();

}
