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

package tj.ne.sostojavshiesja.zakazy.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.ne.sostojavshiesja.zakazy.exception.NoSuchne_sostojavshiesja_zakazyException;
import tj.ne.sostojavshiesja.zakazy.model.ne_sostojavshiesja_zakazy;

/**
 * The persistence interface for the ne_sostojavshiesja_zakazy service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.ne.sostojavshiesja.zakazy.service.persistence.impl.ne_sostojavshiesja_zakazyPersistenceImpl
 * @see ne_sostojavshiesja_zakazyUtil
 * @generated
 */
@ProviderType
public interface ne_sostojavshiesja_zakazyPersistence extends BasePersistence<ne_sostojavshiesja_zakazy> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ne_sostojavshiesja_zakazyUtil} to access the ne_sostojavshiesja_zakazy persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ne_sostojavshiesja_zakazy in the entity cache if it is enabled.
	*
	* @param ne_sostojavshiesja_zakazy the ne_sostojavshiesja_zakazy
	*/
	public void cacheResult(ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);

	/**
	* Caches the ne_sostojavshiesja_zakazies in the entity cache if it is enabled.
	*
	* @param ne_sostojavshiesja_zakazies the ne_sostojavshiesja_zakazies
	*/
	public void cacheResult(
		java.util.List<ne_sostojavshiesja_zakazy> ne_sostojavshiesja_zakazies);

	/**
	* Creates a new ne_sostojavshiesja_zakazy with the primary key. Does not add the ne_sostojavshiesja_zakazy to the database.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key for the new ne_sostojavshiesja_zakazy
	* @return the new ne_sostojavshiesja_zakazy
	*/
	public ne_sostojavshiesja_zakazy create(long ne_sostojavshiesja_zakazy_id);

	/**
	* Removes the ne_sostojavshiesja_zakazy with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy that was removed
	* @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	*/
	public ne_sostojavshiesja_zakazy remove(long ne_sostojavshiesja_zakazy_id)
		throws NoSuchne_sostojavshiesja_zakazyException;

	public ne_sostojavshiesja_zakazy updateImpl(
		ne_sostojavshiesja_zakazy ne_sostojavshiesja_zakazy);

	/**
	* Returns the ne_sostojavshiesja_zakazy with the primary key or throws a {@link NoSuchne_sostojavshiesja_zakazyException} if it could not be found.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy
	* @throws NoSuchne_sostojavshiesja_zakazyException if a ne_sostojavshiesja_zakazy with the primary key could not be found
	*/
	public ne_sostojavshiesja_zakazy findByPrimaryKey(
		long ne_sostojavshiesja_zakazy_id)
		throws NoSuchne_sostojavshiesja_zakazyException;

	/**
	* Returns the ne_sostojavshiesja_zakazy with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ne_sostojavshiesja_zakazy_id the primary key of the ne_sostojavshiesja_zakazy
	* @return the ne_sostojavshiesja_zakazy, or <code>null</code> if a ne_sostojavshiesja_zakazy with the primary key could not be found
	*/
	public ne_sostojavshiesja_zakazy fetchByPrimaryKey(
		long ne_sostojavshiesja_zakazy_id);

	@Override
	public java.util.Map<java.io.Serializable, ne_sostojavshiesja_zakazy> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ne_sostojavshiesja_zakazies.
	*
	* @return the ne_sostojavshiesja_zakazies
	*/
	public java.util.List<ne_sostojavshiesja_zakazy> findAll();

	/**
	* Returns a range of all the ne_sostojavshiesja_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	* @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	* @return the range of ne_sostojavshiesja_zakazies
	*/
	public java.util.List<ne_sostojavshiesja_zakazy> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ne_sostojavshiesja_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	* @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ne_sostojavshiesja_zakazies
	*/
	public java.util.List<ne_sostojavshiesja_zakazy> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ne_sostojavshiesja_zakazy> orderByComparator);

	/**
	* Returns an ordered range of all the ne_sostojavshiesja_zakazies.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_sostojavshiesja_zakazyModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_sostojavshiesja_zakazies
	* @param end the upper bound of the range of ne_sostojavshiesja_zakazies (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ne_sostojavshiesja_zakazies
	*/
	public java.util.List<ne_sostojavshiesja_zakazy> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ne_sostojavshiesja_zakazy> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ne_sostojavshiesja_zakazies from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ne_sostojavshiesja_zakazies.
	*
	* @return the number of ne_sostojavshiesja_zakazies
	*/
	public int countAll();
}