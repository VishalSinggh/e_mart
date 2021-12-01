package com.emart.service.factory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;

import com.emart.exception.BusinessException;
import com.emart.service.template.AbstractTemplate;

/**
 * abstract class to get the factory for passed enum type, extend this class to
 * get a utility class bean in project, use that utility class to get the
 * instance of template as per passed enum
 *
 * @param <T> - template interface that extends {@link AbstractTemplate}
 * @param <E> - enum type to get the factory
 */
public abstract class AbstractFactoryBuilder<T extends AbstractTemplate<E>, E> {

	@Autowired
	List<T> templates;

	Map<E, T> factoryMap = new HashMap<>();

	@PostConstruct
	public void init() {
		templates.forEach(factory -> factoryMap.put(factory.templateFor(), factory));
	}

	public T getFactory(E enumType) throws BusinessException{
		if (Objects.nonNull(factoryMap.get(enumType))) {
			return factoryMap.get(enumType);
		} 
		else {
			throw new BusinessException("No factory found for passed enumType");
		}
		}
	}


