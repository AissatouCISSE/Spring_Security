package sn.lpa.arlwebsite.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import sn.lpa.arlwebsite.entities.AppRole;


@Repository
public interface RoleRepository extends JpaRepository<AppRole, Long> {
	public AppRole findBylibelle(String libelle);
}
