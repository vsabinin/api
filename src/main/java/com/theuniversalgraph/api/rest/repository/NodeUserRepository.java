package com.theuniversalgraph.api.rest.repository;

import org.springframework.stereotype.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.theuniversalgraph.api.rest.entity.NodeUserEntity;
import com.theuniversalgraph.model.*;

@Repository
public interface NodeUserRepository extends JpaRepository<NodeUserEntity, String> {

}