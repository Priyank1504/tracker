package spring.priyank.tracker.repository;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import spring.priyank.tracker.entity.Vehicles;

@Repository
public class VehiclesRepositoryImpl implements VehiclesRepository{
	@PersistenceContext
	private EntityManager entityManager;
	
	public List<Vehicles> findAll() {
		TypedQuery<Vehicles> query=entityManager.createNamedQuery("Vehicles.findAll",
																		Vehicles.class);
		 return query.getResultList();
	}

	public Vehicles findOne(String vehicleVIN) {
		TypedQuery<Vehicles> query=entityManager.createNamedQuery("Vehicles.findByVIN",
				Vehicles.class);
		query.setParameter("paramVin", vehicleVIN);
		List<Vehicles> resultList=query.getResultList();
		if(resultList!= null && resultList.size()>0){
			return resultList.get(0);
		}
		else{
			return null;
		}
     
			
	}

	public Vehicles create(Vehicles veh) {
		entityManager.persist(veh);
        return veh;
	}

	public Vehicles update( Vehicles veh) {
		 return entityManager.merge(veh);	}

	
}
