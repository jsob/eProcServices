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

package tj.informacija.o.razmewenii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.informacija.o.razmewenii.exception.NoSuchinformacija_o_razmeweniiException;
import tj.informacija.o.razmewenii.model.informacija_o_razmewenii;

/**
 * The persistence interface for the informacija_o_razmewenii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.informacija.o.razmewenii.service.persistence.impl.informacija_o_razmeweniiPersistenceImpl
 * @see informacija_o_razmeweniiUtil
 * @generated
 */
@ProviderType
public interface informacija_o_razmeweniiPersistence extends BasePersistence<informacija_o_razmewenii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link informacija_o_razmeweniiUtil} to access the informacija_o_razmewenii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the informacija_o_razmewenii in the entity cache if it is enabled.
	*
	* @param informacija_o_razmewenii the informacija_o_razmewenii
	*/
	public void cacheResult(informacija_o_razmewenii informacija_o_razmewenii);

	/**
	* Caches the informacija_o_razmeweniis in the entity cache if it is enabled.
	*
	* @param informacija_o_razmeweniis the informacija_o_razmeweniis
	*/
	public void cacheResult(
		java.util.List<informacija_o_razmewenii> informacija_o_razmeweniis);

	/**
	* Creates a new informacija_o_razmewenii with the primary key. Does not add the informacija_o_razmewenii to the database.
	*
	* @param informacija_o_razmewenii_id the primary key for the new informacija_o_razmewenii
	* @return the new informacija_o_razmewenii
	*/
	public informacija_o_razmewenii create(long informacija_o_razmewenii_id);

	/**
	* Removes the informacija_o_razmewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	* @return the informacija_o_razmewenii that was removed
	* @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	*/
	public informacija_o_razmewenii remove(long informacija_o_razmewenii_id)
		throws NoSuchinformacija_o_razmeweniiException;

	public informacija_o_razmewenii updateImpl(
		informacija_o_razmewenii informacija_o_razmewenii);

	/**
	* Returns the informacija_o_razmewenii with the primary key or throws a {@link NoSuchinformacija_o_razmeweniiException} if it could not be found.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	* @return the informacija_o_razmewenii
	* @throws NoSuchinformacija_o_razmeweniiException if a informacija_o_razmewenii with the primary key could not be found
	*/
	public informacija_o_razmewenii findByPrimaryKey(
		long informacija_o_razmewenii_id)
		throws NoSuchinformacija_o_razmeweniiException;

	/**
	* Returns the informacija_o_razmewenii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param informacija_o_razmewenii_id the primary key of the informacija_o_razmewenii
	* @return the informacija_o_razmewenii, or <code>null</code> if a informacija_o_razmewenii with the primary key could not be found
	*/
	public informacija_o_razmewenii fetchByPrimaryKey(
		long informacija_o_razmewenii_id);

	@Override
	public java.util.Map<java.io.Serializable, informacija_o_razmewenii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the informacija_o_razmeweniis.
	*
	* @return the informacija_o_razmeweniis
	*/
	public java.util.List<informacija_o_razmewenii> findAll();

	/**
	* Returns a range of all the informacija_o_razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija_o_razmeweniis
	* @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	* @return the range of informacija_o_razmeweniis
	*/
	public java.util.List<informacija_o_razmewenii> findAll(int start, int end);

	/**
	* Returns an ordered range of all the informacija_o_razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija_o_razmeweniis
	* @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of informacija_o_razmeweniis
	*/
	public java.util.List<informacija_o_razmewenii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<informacija_o_razmewenii> orderByComparator);

	/**
	* Returns an ordered range of all the informacija_o_razmeweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link informacija_o_razmeweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of informacija_o_razmeweniis
	* @param end the upper bound of the range of informacija_o_razmeweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of informacija_o_razmeweniis
	*/
	public java.util.List<informacija_o_razmewenii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<informacija_o_razmewenii> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the informacija_o_razmeweniis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of informacija_o_razmeweniis.
	*
	* @return the number of informacija_o_razmeweniis
	*/
	public int countAll();
}