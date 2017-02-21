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

package tj.istorija.popolnenij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.istorija.popolnenij.exception.NoSuchistorija_popolnenijException;
import tj.istorija.popolnenij.model.istorija_popolnenij;

/**
 * The persistence interface for the istorija_popolnenij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.istorija.popolnenij.service.persistence.impl.istorija_popolnenijPersistenceImpl
 * @see istorija_popolnenijUtil
 * @generated
 */
@ProviderType
public interface istorija_popolnenijPersistence extends BasePersistence<istorija_popolnenij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link istorija_popolnenijUtil} to access the istorija_popolnenij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the istorija_popolnenij in the entity cache if it is enabled.
	*
	* @param istorija_popolnenij the istorija_popolnenij
	*/
	public void cacheResult(istorija_popolnenij istorija_popolnenij);

	/**
	* Caches the istorija_popolnenijs in the entity cache if it is enabled.
	*
	* @param istorija_popolnenijs the istorija_popolnenijs
	*/
	public void cacheResult(
		java.util.List<istorija_popolnenij> istorija_popolnenijs);

	/**
	* Creates a new istorija_popolnenij with the primary key. Does not add the istorija_popolnenij to the database.
	*
	* @param istorija_popolnenij_id the primary key for the new istorija_popolnenij
	* @return the new istorija_popolnenij
	*/
	public istorija_popolnenij create(long istorija_popolnenij_id);

	/**
	* Removes the istorija_popolnenij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	* @return the istorija_popolnenij that was removed
	* @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	*/
	public istorija_popolnenij remove(long istorija_popolnenij_id)
		throws NoSuchistorija_popolnenijException;

	public istorija_popolnenij updateImpl(
		istorija_popolnenij istorija_popolnenij);

	/**
	* Returns the istorija_popolnenij with the primary key or throws a {@link NoSuchistorija_popolnenijException} if it could not be found.
	*
	* @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	* @return the istorija_popolnenij
	* @throws NoSuchistorija_popolnenijException if a istorija_popolnenij with the primary key could not be found
	*/
	public istorija_popolnenij findByPrimaryKey(long istorija_popolnenij_id)
		throws NoSuchistorija_popolnenijException;

	/**
	* Returns the istorija_popolnenij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param istorija_popolnenij_id the primary key of the istorija_popolnenij
	* @return the istorija_popolnenij, or <code>null</code> if a istorija_popolnenij with the primary key could not be found
	*/
	public istorija_popolnenij fetchByPrimaryKey(long istorija_popolnenij_id);

	@Override
	public java.util.Map<java.io.Serializable, istorija_popolnenij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the istorija_popolnenijs.
	*
	* @return the istorija_popolnenijs
	*/
	public java.util.List<istorija_popolnenij> findAll();

	/**
	* Returns a range of all the istorija_popolnenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istorija_popolnenijs
	* @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	* @return the range of istorija_popolnenijs
	*/
	public java.util.List<istorija_popolnenij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the istorija_popolnenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istorija_popolnenijs
	* @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istorija_popolnenijs
	*/
	public java.util.List<istorija_popolnenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istorija_popolnenij> orderByComparator);

	/**
	* Returns an ordered range of all the istorija_popolnenijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istorija_popolnenijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istorija_popolnenijs
	* @param end the upper bound of the range of istorija_popolnenijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istorija_popolnenijs
	*/
	public java.util.List<istorija_popolnenij> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<istorija_popolnenij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the istorija_popolnenijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of istorija_popolnenijs.
	*
	* @return the number of istorija_popolnenijs
	*/
	public int countAll();
}