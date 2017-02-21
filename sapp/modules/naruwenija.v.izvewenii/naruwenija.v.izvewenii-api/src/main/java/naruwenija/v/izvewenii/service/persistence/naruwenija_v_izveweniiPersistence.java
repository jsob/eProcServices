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

package naruwenija.v.izvewenii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import naruwenija.v.izvewenii.exception.NoSuchnaruwenija_v_izveweniiException;
import naruwenija.v.izvewenii.model.naruwenija_v_izvewenii;

/**
 * The persistence interface for the naruwenija_v_izvewenii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see naruwenija.v.izvewenii.service.persistence.impl.naruwenija_v_izveweniiPersistenceImpl
 * @see naruwenija_v_izveweniiUtil
 * @generated
 */
@ProviderType
public interface naruwenija_v_izveweniiPersistence extends BasePersistence<naruwenija_v_izvewenii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link naruwenija_v_izveweniiUtil} to access the naruwenija_v_izvewenii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the naruwenija_v_izvewenii in the entity cache if it is enabled.
	*
	* @param naruwenija_v_izvewenii the naruwenija_v_izvewenii
	*/
	public void cacheResult(naruwenija_v_izvewenii naruwenija_v_izvewenii);

	/**
	* Caches the naruwenija_v_izveweniis in the entity cache if it is enabled.
	*
	* @param naruwenija_v_izveweniis the naruwenija_v_izveweniis
	*/
	public void cacheResult(
		java.util.List<naruwenija_v_izvewenii> naruwenija_v_izveweniis);

	/**
	* Creates a new naruwenija_v_izvewenii with the primary key. Does not add the naruwenija_v_izvewenii to the database.
	*
	* @param naruwenija_v_izvewenii_id the primary key for the new naruwenija_v_izvewenii
	* @return the new naruwenija_v_izvewenii
	*/
	public naruwenija_v_izvewenii create(long naruwenija_v_izvewenii_id);

	/**
	* Removes the naruwenija_v_izvewenii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii that was removed
	* @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public naruwenija_v_izvewenii remove(long naruwenija_v_izvewenii_id)
		throws NoSuchnaruwenija_v_izveweniiException;

	public naruwenija_v_izvewenii updateImpl(
		naruwenija_v_izvewenii naruwenija_v_izvewenii);

	/**
	* Returns the naruwenija_v_izvewenii with the primary key or throws a {@link NoSuchnaruwenija_v_izveweniiException} if it could not be found.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii
	* @throws NoSuchnaruwenija_v_izveweniiException if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public naruwenija_v_izvewenii findByPrimaryKey(
		long naruwenija_v_izvewenii_id)
		throws NoSuchnaruwenija_v_izveweniiException;

	/**
	* Returns the naruwenija_v_izvewenii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param naruwenija_v_izvewenii_id the primary key of the naruwenija_v_izvewenii
	* @return the naruwenija_v_izvewenii, or <code>null</code> if a naruwenija_v_izvewenii with the primary key could not be found
	*/
	public naruwenija_v_izvewenii fetchByPrimaryKey(
		long naruwenija_v_izvewenii_id);

	@Override
	public java.util.Map<java.io.Serializable, naruwenija_v_izvewenii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the naruwenija_v_izveweniis.
	*
	* @return the naruwenija_v_izveweniis
	*/
	public java.util.List<naruwenija_v_izvewenii> findAll();

	/**
	* Returns a range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @return the range of naruwenija_v_izveweniis
	*/
	public java.util.List<naruwenija_v_izvewenii> findAll(int start, int end);

	/**
	* Returns an ordered range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of naruwenija_v_izveweniis
	*/
	public java.util.List<naruwenija_v_izvewenii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<naruwenija_v_izvewenii> orderByComparator);

	/**
	* Returns an ordered range of all the naruwenija_v_izveweniis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link naruwenija_v_izveweniiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of naruwenija_v_izveweniis
	* @param end the upper bound of the range of naruwenija_v_izveweniis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of naruwenija_v_izveweniis
	*/
	public java.util.List<naruwenija_v_izvewenii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<naruwenija_v_izvewenii> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the naruwenija_v_izveweniis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of naruwenija_v_izveweniis.
	*
	* @return the number of naruwenija_v_izveweniis
	*/
	public int countAll();
}