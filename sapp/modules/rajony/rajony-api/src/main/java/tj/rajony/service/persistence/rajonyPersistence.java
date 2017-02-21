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

package tj.rajony.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.rajony.exception.NoSuchrajonyException;

import tj.rajony.model.rajony;

/**
 * The persistence interface for the rajony service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.rajony.service.persistence.impl.rajonyPersistenceImpl
 * @see rajonyUtil
 * @generated
 */
@ProviderType
public interface rajonyPersistence extends BasePersistence<rajony> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link rajonyUtil} to access the rajony persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the rajony in the entity cache if it is enabled.
	*
	* @param rajony the rajony
	*/
	public void cacheResult(rajony rajony);

	/**
	* Caches the rajonies in the entity cache if it is enabled.
	*
	* @param rajonies the rajonies
	*/
	public void cacheResult(java.util.List<rajony> rajonies);

	/**
	* Creates a new rajony with the primary key. Does not add the rajony to the database.
	*
	* @param rajony_id the primary key for the new rajony
	* @return the new rajony
	*/
	public rajony create(long rajony_id);

	/**
	* Removes the rajony with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param rajony_id the primary key of the rajony
	* @return the rajony that was removed
	* @throws NoSuchrajonyException if a rajony with the primary key could not be found
	*/
	public rajony remove(long rajony_id) throws NoSuchrajonyException;

	public rajony updateImpl(rajony rajony);

	/**
	* Returns the rajony with the primary key or throws a {@link NoSuchrajonyException} if it could not be found.
	*
	* @param rajony_id the primary key of the rajony
	* @return the rajony
	* @throws NoSuchrajonyException if a rajony with the primary key could not be found
	*/
	public rajony findByPrimaryKey(long rajony_id) throws NoSuchrajonyException;

	/**
	* Returns the rajony with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param rajony_id the primary key of the rajony
	* @return the rajony, or <code>null</code> if a rajony with the primary key could not be found
	*/
	public rajony fetchByPrimaryKey(long rajony_id);

	@Override
	public java.util.Map<java.io.Serializable, rajony> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the rajonies.
	*
	* @return the rajonies
	*/
	public java.util.List<rajony> findAll();

	/**
	* Returns a range of all the rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rajonies
	* @param end the upper bound of the range of rajonies (not inclusive)
	* @return the range of rajonies
	*/
	public java.util.List<rajony> findAll(int start, int end);

	/**
	* Returns an ordered range of all the rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rajonies
	* @param end the upper bound of the range of rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of rajonies
	*/
	public java.util.List<rajony> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rajony> orderByComparator);

	/**
	* Returns an ordered range of all the rajonies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link rajonyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of rajonies
	* @param end the upper bound of the range of rajonies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of rajonies
	*/
	public java.util.List<rajony> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<rajony> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the rajonies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of rajonies.
	*
	* @return the number of rajonies
	*/
	public int countAll();
}