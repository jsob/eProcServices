/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package tj.prichiny.otmeny.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.prichiny.otmeny.exception.NoSuchprichiny_otmenyException;
import tj.prichiny.otmeny.model.prichiny_otmeny;

/**
 * The persistence interface for the prichiny_otmeny service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.prichiny.otmeny.service.persistence.impl.prichiny_otmenyPersistenceImpl
 * @see prichiny_otmenyUtil
 * @generated
 */
@ProviderType
public interface prichiny_otmenyPersistence extends BasePersistence<prichiny_otmeny> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link prichiny_otmenyUtil} to access the prichiny_otmeny persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the prichiny_otmeny in the entity cache if it is enabled.
	*
	* @param prichiny_otmeny the prichiny_otmeny
	*/
	public void cacheResult(prichiny_otmeny prichiny_otmeny);

	/**
	* Caches the prichiny_otmenies in the entity cache if it is enabled.
	*
	* @param prichiny_otmenies the prichiny_otmenies
	*/
	public void cacheResult(java.util.List<prichiny_otmeny> prichiny_otmenies);

	/**
	* Creates a new prichiny_otmeny with the primary key. Does not add the prichiny_otmeny to the database.
	*
	* @param prichiny_otmeny_id the primary key for the new prichiny_otmeny
	* @return the new prichiny_otmeny
	*/
	public prichiny_otmeny create(long prichiny_otmeny_id);

	/**
	* Removes the prichiny_otmeny with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny that was removed
	* @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	*/
	public prichiny_otmeny remove(long prichiny_otmeny_id)
		throws NoSuchprichiny_otmenyException;

	public prichiny_otmeny updateImpl(prichiny_otmeny prichiny_otmeny);

	/**
	* Returns the prichiny_otmeny with the primary key or throws a {@link NoSuchprichiny_otmenyException} if it could not be found.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny
	* @throws NoSuchprichiny_otmenyException if a prichiny_otmeny with the primary key could not be found
	*/
	public prichiny_otmeny findByPrimaryKey(long prichiny_otmeny_id)
		throws NoSuchprichiny_otmenyException;

	/**
	* Returns the prichiny_otmeny with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param prichiny_otmeny_id the primary key of the prichiny_otmeny
	* @return the prichiny_otmeny, or <code>null</code> if a prichiny_otmeny with the primary key could not be found
	*/
	public prichiny_otmeny fetchByPrimaryKey(long prichiny_otmeny_id);

	@Override
	public java.util.Map<java.io.Serializable, prichiny_otmeny> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the prichiny_otmenies.
	*
	* @return the prichiny_otmenies
	*/
	public java.util.List<prichiny_otmeny> findAll();

	/**
	* Returns a range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @return the range of prichiny_otmenies
	*/
	public java.util.List<prichiny_otmeny> findAll(int start, int end);

	/**
	* Returns an ordered range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of prichiny_otmenies
	*/
	public java.util.List<prichiny_otmeny> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prichiny_otmeny> orderByComparator);

	/**
	* Returns an ordered range of all the prichiny_otmenies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link prichiny_otmenyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of prichiny_otmenies
	* @param end the upper bound of the range of prichiny_otmenies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of prichiny_otmenies
	*/
	public java.util.List<prichiny_otmeny> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<prichiny_otmeny> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the prichiny_otmenies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of prichiny_otmenies.
	*
	* @return the number of prichiny_otmenies
	*/
	public int countAll();
}