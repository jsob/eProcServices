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

package tj.edinicy.izmerenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.edinicy.izmerenija.exception.NoSuchedinicy_izmerenijaException;
import tj.edinicy.izmerenija.model.edinicy_izmerenija;

/**
 * The persistence interface for the edinicy_izmerenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.edinicy.izmerenija.service.persistence.impl.edinicy_izmerenijaPersistenceImpl
 * @see edinicy_izmerenijaUtil
 * @generated
 */
@ProviderType
public interface edinicy_izmerenijaPersistence extends BasePersistence<edinicy_izmerenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link edinicy_izmerenijaUtil} to access the edinicy_izmerenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the edinicy_izmerenija in the entity cache if it is enabled.
	*
	* @param edinicy_izmerenija the edinicy_izmerenija
	*/
	public void cacheResult(edinicy_izmerenija edinicy_izmerenija);

	/**
	* Caches the edinicy_izmerenijas in the entity cache if it is enabled.
	*
	* @param edinicy_izmerenijas the edinicy_izmerenijas
	*/
	public void cacheResult(
		java.util.List<edinicy_izmerenija> edinicy_izmerenijas);

	/**
	* Creates a new edinicy_izmerenija with the primary key. Does not add the edinicy_izmerenija to the database.
	*
	* @param edinicy_izmerenija_id the primary key for the new edinicy_izmerenija
	* @return the new edinicy_izmerenija
	*/
	public edinicy_izmerenija create(long edinicy_izmerenija_id);

	/**
	* Removes the edinicy_izmerenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	* @return the edinicy_izmerenija that was removed
	* @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	*/
	public edinicy_izmerenija remove(long edinicy_izmerenija_id)
		throws NoSuchedinicy_izmerenijaException;

	public edinicy_izmerenija updateImpl(edinicy_izmerenija edinicy_izmerenija);

	/**
	* Returns the edinicy_izmerenija with the primary key or throws a {@link NoSuchedinicy_izmerenijaException} if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	* @return the edinicy_izmerenija
	* @throws NoSuchedinicy_izmerenijaException if a edinicy_izmerenija with the primary key could not be found
	*/
	public edinicy_izmerenija findByPrimaryKey(long edinicy_izmerenija_id)
		throws NoSuchedinicy_izmerenijaException;

	/**
	* Returns the edinicy_izmerenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param edinicy_izmerenija_id the primary key of the edinicy_izmerenija
	* @return the edinicy_izmerenija, or <code>null</code> if a edinicy_izmerenija with the primary key could not be found
	*/
	public edinicy_izmerenija fetchByPrimaryKey(long edinicy_izmerenija_id);

	@Override
	public java.util.Map<java.io.Serializable, edinicy_izmerenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the edinicy_izmerenijas.
	*
	* @return the edinicy_izmerenijas
	*/
	public java.util.List<edinicy_izmerenija> findAll();

	/**
	* Returns a range of all the edinicy_izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy_izmerenijas
	* @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	* @return the range of edinicy_izmerenijas
	*/
	public java.util.List<edinicy_izmerenija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the edinicy_izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy_izmerenijas
	* @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of edinicy_izmerenijas
	*/
	public java.util.List<edinicy_izmerenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<edinicy_izmerenija> orderByComparator);

	/**
	* Returns an ordered range of all the edinicy_izmerenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link edinicy_izmerenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of edinicy_izmerenijas
	* @param end the upper bound of the range of edinicy_izmerenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of edinicy_izmerenijas
	*/
	public java.util.List<edinicy_izmerenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<edinicy_izmerenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the edinicy_izmerenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of edinicy_izmerenijas.
	*
	* @return the number of edinicy_izmerenijas
	*/
	public int countAll();
}