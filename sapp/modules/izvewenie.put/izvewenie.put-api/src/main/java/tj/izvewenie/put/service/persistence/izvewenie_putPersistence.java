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

package tj.izvewenie.put.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.izvewenie.put.exception.NoSuchizvewenie_putException;
import tj.izvewenie.put.model.izvewenie_put;

/**
 * The persistence interface for the izvewenie_put service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.izvewenie.put.service.persistence.impl.izvewenie_putPersistenceImpl
 * @see izvewenie_putUtil
 * @generated
 */
@ProviderType
public interface izvewenie_putPersistence extends BasePersistence<izvewenie_put> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link izvewenie_putUtil} to access the izvewenie_put persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the izvewenie_put in the entity cache if it is enabled.
	*
	* @param izvewenie_put the izvewenie_put
	*/
	public void cacheResult(izvewenie_put izvewenie_put);

	/**
	* Caches the izvewenie_puts in the entity cache if it is enabled.
	*
	* @param izvewenie_puts the izvewenie_puts
	*/
	public void cacheResult(java.util.List<izvewenie_put> izvewenie_puts);

	/**
	* Creates a new izvewenie_put with the primary key. Does not add the izvewenie_put to the database.
	*
	* @param izvewenie_put_id the primary key for the new izvewenie_put
	* @return the new izvewenie_put
	*/
	public izvewenie_put create(long izvewenie_put_id);

	/**
	* Removes the izvewenie_put with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put that was removed
	* @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	*/
	public izvewenie_put remove(long izvewenie_put_id)
		throws NoSuchizvewenie_putException;

	public izvewenie_put updateImpl(izvewenie_put izvewenie_put);

	/**
	* Returns the izvewenie_put with the primary key or throws a {@link NoSuchizvewenie_putException} if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put
	* @throws NoSuchizvewenie_putException if a izvewenie_put with the primary key could not be found
	*/
	public izvewenie_put findByPrimaryKey(long izvewenie_put_id)
		throws NoSuchizvewenie_putException;

	/**
	* Returns the izvewenie_put with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param izvewenie_put_id the primary key of the izvewenie_put
	* @return the izvewenie_put, or <code>null</code> if a izvewenie_put with the primary key could not be found
	*/
	public izvewenie_put fetchByPrimaryKey(long izvewenie_put_id);

	@Override
	public java.util.Map<java.io.Serializable, izvewenie_put> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the izvewenie_puts.
	*
	* @return the izvewenie_puts
	*/
	public java.util.List<izvewenie_put> findAll();

	/**
	* Returns a range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @return the range of izvewenie_puts
	*/
	public java.util.List<izvewenie_put> findAll(int start, int end);

	/**
	* Returns an ordered range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of izvewenie_puts
	*/
	public java.util.List<izvewenie_put> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<izvewenie_put> orderByComparator);

	/**
	* Returns an ordered range of all the izvewenie_puts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link izvewenie_putModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of izvewenie_puts
	* @param end the upper bound of the range of izvewenie_puts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of izvewenie_puts
	*/
	public java.util.List<izvewenie_put> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<izvewenie_put> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the izvewenie_puts from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of izvewenie_puts.
	*
	* @return the number of izvewenie_puts
	*/
	public int countAll();
}