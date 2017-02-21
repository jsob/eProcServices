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

package tj.izvewenija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.izvewenija.exception.NoSuchizvewenijaException;

import tj.izvewenija.model.izvewenija;

/**
 * The persistence interface for the izvewenija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.izvewenija.service.persistence.impl.izvewenijaPersistenceImpl
 * @see izvewenijaUtil
 * @generated
 */
@ProviderType
public interface izvewenijaPersistence extends BasePersistence<izvewenija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link izvewenijaUtil} to access the izvewenija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the izvewenija in the entity cache if it is enabled.
	*
	* @param izvewenija the izvewenija
	*/
	public void cacheResult(izvewenija izvewenija);

	/**
	* Caches the izvewenijas in the entity cache if it is enabled.
	*
	* @param izvewenijas the izvewenijas
	*/
	public void cacheResult(java.util.List<izvewenija> izvewenijas);

	/**
	* Creates a new izvewenija with the primary key. Does not add the izvewenija to the database.
	*
	* @param izvewenija_id the primary key for the new izvewenija
	* @return the new izvewenija
	*/
	public izvewenija create(long izvewenija_id);

	/**
	* Removes the izvewenija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija that was removed
	* @throws NoSuchizvewenijaException if a izvewenija with the primary key could not be found
	*/
	public izvewenija remove(long izvewenija_id)
		throws NoSuchizvewenijaException;

	public izvewenija updateImpl(izvewenija izvewenija);

	/**
	* Returns the izvewenija with the primary key or throws a {@link NoSuchizvewenijaException} if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija
	* @throws NoSuchizvewenijaException if a izvewenija with the primary key could not be found
	*/
	public izvewenija findByPrimaryKey(long izvewenija_id)
		throws NoSuchizvewenijaException;

	/**
	* Returns the izvewenija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenija_id the primary key of the izvewenija
	* @return the izvewenija, or <code>null</code> if a izvewenija with the primary key could not be found
	*/
	public izvewenija fetchByPrimaryKey(long izvewenija_id);

	@Override
	public java.util.Map<java.io.Serializable, izvewenija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the izvewenijas.
	*
	* @return the izvewenijas
	*/
	public java.util.List<izvewenija> findAll();

	/**
	* Returns a range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @return the range of izvewenijas
	*/
	public java.util.List<izvewenija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenijas
	*/
	public java.util.List<izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<izvewenija> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenijas
	* @param end the upper bound of the range of izvewenijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenijas
	*/
	public java.util.List<izvewenija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<izvewenija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the izvewenijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of izvewenijas.
	*
	* @return the number of izvewenijas
	*/
	public int countAll();
}