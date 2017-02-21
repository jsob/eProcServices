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

package tj.status.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.status.izvewenij.exception.NoSuchstatus_izvewenijException;
import tj.status.izvewenij.model.status_izvewenij;

/**
 * The persistence interface for the status_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.status.izvewenij.service.persistence.impl.status_izvewenijPersistenceImpl
 * @see status_izvewenijUtil
 * @generated
 */
@ProviderType
public interface status_izvewenijPersistence extends BasePersistence<status_izvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link status_izvewenijUtil} to access the status_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the status_izvewenij in the entity cache if it is enabled.
	*
	* @param status_izvewenij the status_izvewenij
	*/
	public void cacheResult(status_izvewenij status_izvewenij);

	/**
	* Caches the status_izvewenijs in the entity cache if it is enabled.
	*
	* @param status_izvewenijs the status_izvewenijs
	*/
	public void cacheResult(java.util.List<status_izvewenij> status_izvewenijs);

	/**
	* Creates a new status_izvewenij with the primary key. Does not add the status_izvewenij to the database.
	*
	* @param status_izvewenij_id the primary key for the new status_izvewenij
	* @return the new status_izvewenij
	*/
	public status_izvewenij create(long status_izvewenij_id);

	/**
	* Removes the status_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param status_izvewenij_id the primary key of the status_izvewenij
	* @return the status_izvewenij that was removed
	* @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	*/
	public status_izvewenij remove(long status_izvewenij_id)
		throws NoSuchstatus_izvewenijException;

	public status_izvewenij updateImpl(status_izvewenij status_izvewenij);

	/**
	* Returns the status_izvewenij with the primary key or throws a {@link NoSuchstatus_izvewenijException} if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status_izvewenij
	* @return the status_izvewenij
	* @throws NoSuchstatus_izvewenijException if a status_izvewenij with the primary key could not be found
	*/
	public status_izvewenij findByPrimaryKey(long status_izvewenij_id)
		throws NoSuchstatus_izvewenijException;

	/**
	* Returns the status_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param status_izvewenij_id the primary key of the status_izvewenij
	* @return the status_izvewenij, or <code>null</code> if a status_izvewenij with the primary key could not be found
	*/
	public status_izvewenij fetchByPrimaryKey(long status_izvewenij_id);

	@Override
	public java.util.Map<java.io.Serializable, status_izvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the status_izvewenijs.
	*
	* @return the status_izvewenijs
	*/
	public java.util.List<status_izvewenij> findAll();

	/**
	* Returns a range of all the status_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status_izvewenijs
	* @param end the upper bound of the range of status_izvewenijs (not inclusive)
	* @return the range of status_izvewenijs
	*/
	public java.util.List<status_izvewenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the status_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status_izvewenijs
	* @param end the upper bound of the range of status_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of status_izvewenijs
	*/
	public java.util.List<status_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<status_izvewenij> orderByComparator);

	/**
	* Returns an ordered range of all the status_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link status_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of status_izvewenijs
	* @param end the upper bound of the range of status_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of status_izvewenijs
	*/
	public java.util.List<status_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<status_izvewenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the status_izvewenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of status_izvewenijs.
	*
	* @return the number of status_izvewenijs
	*/
	public int countAll();
}