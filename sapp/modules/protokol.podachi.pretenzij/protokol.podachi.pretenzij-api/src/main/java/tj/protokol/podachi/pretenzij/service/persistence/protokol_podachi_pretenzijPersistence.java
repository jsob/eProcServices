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

package tj.protokol.podachi.pretenzij.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.protokol.podachi.pretenzij.exception.NoSuchprotokol_podachi_pretenzijException;
import tj.protokol.podachi.pretenzij.model.protokol_podachi_pretenzij;

/**
 * The persistence interface for the protokol_podachi_pretenzij service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.podachi.pretenzij.service.persistence.impl.protokol_podachi_pretenzijPersistenceImpl
 * @see protokol_podachi_pretenzijUtil
 * @generated
 */
@ProviderType
public interface protokol_podachi_pretenzijPersistence extends BasePersistence<protokol_podachi_pretenzij> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link protokol_podachi_pretenzijUtil} to access the protokol_podachi_pretenzij persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the protokol_podachi_pretenzij in the entity cache if it is enabled.
	*
	* @param protokol_podachi_pretenzij the protokol_podachi_pretenzij
	*/
	public void cacheResult(
		protokol_podachi_pretenzij protokol_podachi_pretenzij);

	/**
	* Caches the protokol_podachi_pretenzijs in the entity cache if it is enabled.
	*
	* @param protokol_podachi_pretenzijs the protokol_podachi_pretenzijs
	*/
	public void cacheResult(
		java.util.List<protokol_podachi_pretenzij> protokol_podachi_pretenzijs);

	/**
	* Creates a new protokol_podachi_pretenzij with the primary key. Does not add the protokol_podachi_pretenzij to the database.
	*
	* @param protokol_podachi_pretenzij_id the primary key for the new protokol_podachi_pretenzij
	* @return the new protokol_podachi_pretenzij
	*/
	public protokol_podachi_pretenzij create(long protokol_podachi_pretenzij_id);

	/**
	* Removes the protokol_podachi_pretenzij with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij that was removed
	* @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	public protokol_podachi_pretenzij remove(long protokol_podachi_pretenzij_id)
		throws NoSuchprotokol_podachi_pretenzijException;

	public protokol_podachi_pretenzij updateImpl(
		protokol_podachi_pretenzij protokol_podachi_pretenzij);

	/**
	* Returns the protokol_podachi_pretenzij with the primary key or throws a {@link NoSuchprotokol_podachi_pretenzijException} if it could not be found.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij
	* @throws NoSuchprotokol_podachi_pretenzijException if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	public protokol_podachi_pretenzij findByPrimaryKey(
		long protokol_podachi_pretenzij_id)
		throws NoSuchprotokol_podachi_pretenzijException;

	/**
	* Returns the protokol_podachi_pretenzij with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protokol_podachi_pretenzij_id the primary key of the protokol_podachi_pretenzij
	* @return the protokol_podachi_pretenzij, or <code>null</code> if a protokol_podachi_pretenzij with the primary key could not be found
	*/
	public protokol_podachi_pretenzij fetchByPrimaryKey(
		long protokol_podachi_pretenzij_id);

	@Override
	public java.util.Map<java.io.Serializable, protokol_podachi_pretenzij> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the protokol_podachi_pretenzijs.
	*
	* @return the protokol_podachi_pretenzijs
	*/
	public java.util.List<protokol_podachi_pretenzij> findAll();

	/**
	* Returns a range of all the protokol_podachi_pretenzijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_podachi_pretenzijs
	* @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	* @return the range of protokol_podachi_pretenzijs
	*/
	public java.util.List<protokol_podachi_pretenzij> findAll(int start, int end);

	/**
	* Returns an ordered range of all the protokol_podachi_pretenzijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_podachi_pretenzijs
	* @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protokol_podachi_pretenzijs
	*/
	public java.util.List<protokol_podachi_pretenzij> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<protokol_podachi_pretenzij> orderByComparator);

	/**
	* Returns an ordered range of all the protokol_podachi_pretenzijs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_podachi_pretenzijModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_podachi_pretenzijs
	* @param end the upper bound of the range of protokol_podachi_pretenzijs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protokol_podachi_pretenzijs
	*/
	public java.util.List<protokol_podachi_pretenzij> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<protokol_podachi_pretenzij> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the protokol_podachi_pretenzijs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of protokol_podachi_pretenzijs.
	*
	* @return the number of protokol_podachi_pretenzijs
	*/
	public int countAll();
}