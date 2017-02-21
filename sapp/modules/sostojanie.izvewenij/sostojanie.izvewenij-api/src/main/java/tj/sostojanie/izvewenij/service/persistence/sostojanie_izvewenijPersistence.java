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

package tj.sostojanie.izvewenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.sostojanie.izvewenij.exception.NoSuchsostojanie_izvewenijException;
import tj.sostojanie.izvewenij.model.sostojanie_izvewenij;

/**
 * The persistence interface for the sostojanie_izvewenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.sostojanie.izvewenij.service.persistence.impl.sostojanie_izvewenijPersistenceImpl
 * @see sostojanie_izvewenijUtil
 * @generated
 */
@ProviderType
public interface sostojanie_izvewenijPersistence extends BasePersistence<sostojanie_izvewenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link sostojanie_izvewenijUtil} to access the sostojanie_izvewenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the sostojanie_izvewenij in the entity cache if it is enabled.
	*
	* @param sostojanie_izvewenij the sostojanie_izvewenij
	*/
	public void cacheResult(sostojanie_izvewenij sostojanie_izvewenij);

	/**
	* Caches the sostojanie_izvewenijs in the entity cache if it is enabled.
	*
	* @param sostojanie_izvewenijs the sostojanie_izvewenijs
	*/
	public void cacheResult(
		java.util.List<sostojanie_izvewenij> sostojanie_izvewenijs);

	/**
	* Creates a new sostojanie_izvewenij with the primary key. Does not add the sostojanie_izvewenij to the database.
	*
	* @param sostojanie_izvewenij_id the primary key for the new sostojanie_izvewenij
	* @return the new sostojanie_izvewenij
	*/
	public sostojanie_izvewenij create(long sostojanie_izvewenij_id);

	/**
	* Removes the sostojanie_izvewenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	* @return the sostojanie_izvewenij that was removed
	* @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	*/
	public sostojanie_izvewenij remove(long sostojanie_izvewenij_id)
		throws NoSuchsostojanie_izvewenijException;

	public sostojanie_izvewenij updateImpl(
		sostojanie_izvewenij sostojanie_izvewenij);

	/**
	* Returns the sostojanie_izvewenij with the primary key or throws a {@link NoSuchsostojanie_izvewenijException} if it could not be found.
	*
	* @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	* @return the sostojanie_izvewenij
	* @throws NoSuchsostojanie_izvewenijException if a sostojanie_izvewenij with the primary key could not be found
	*/
	public sostojanie_izvewenij findByPrimaryKey(long sostojanie_izvewenij_id)
		throws NoSuchsostojanie_izvewenijException;

	/**
	* Returns the sostojanie_izvewenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param sostojanie_izvewenij_id the primary key of the sostojanie_izvewenij
	* @return the sostojanie_izvewenij, or <code>null</code> if a sostojanie_izvewenij with the primary key could not be found
	*/
	public sostojanie_izvewenij fetchByPrimaryKey(long sostojanie_izvewenij_id);

	@Override
	public java.util.Map<java.io.Serializable, sostojanie_izvewenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the sostojanie_izvewenijs.
	*
	* @return the sostojanie_izvewenijs
	*/
	public java.util.List<sostojanie_izvewenij> findAll();

	/**
	* Returns a range of all the sostojanie_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sostojanie_izvewenijs
	* @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	* @return the range of sostojanie_izvewenijs
	*/
	public java.util.List<sostojanie_izvewenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the sostojanie_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sostojanie_izvewenijs
	* @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of sostojanie_izvewenijs
	*/
	public java.util.List<sostojanie_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sostojanie_izvewenij> orderByComparator);

	/**
	* Returns an ordered range of all the sostojanie_izvewenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link sostojanie_izvewenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of sostojanie_izvewenijs
	* @param end the upper bound of the range of sostojanie_izvewenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of sostojanie_izvewenijs
	*/
	public java.util.List<sostojanie_izvewenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<sostojanie_izvewenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the sostojanie_izvewenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of sostojanie_izvewenijs.
	*
	* @return the number of sostojanie_izvewenijs
	*/
	public int countAll();
}