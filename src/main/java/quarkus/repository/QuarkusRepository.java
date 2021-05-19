package quarkus.repository;

import javax.enterprise.context.ApplicationScoped;

import io.quarkus.hibernate.orm.panache.PanacheRepository;
import quarkus.model.Quarkus;

@ApplicationScoped
public class QuarkusRepository implements PanacheRepository<Quarkus> {

}
