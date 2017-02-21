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

package tj.spisok.tovarov.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.spisok.tovarov.exception.NoSuchspisok_tovarovException;
import tj.spisok.tovarov.model.spisok_tovarov;

/**
 * The persistence interface for the spisok_tovarov service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.service.persistence.impl.spisok_tovarovPersistenceImpl
 * @see spisok_tovarovUtil
 * @generated
 */
@ProviderType
public interface spisok_tovarovPersistence extends BasePersistence<spisok_tovarov> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link spisok_tovarovUtil} to access the spisok_tovarov persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the spisok_tovarov in the entity cache if it is enabled.
	*
	* @param spisok_tovarov the spisok_tovarov
	*/
	public void cacheResult(spisok_tovarov spisok_tovarov);

	/**
	* Caches the spisok_tovarovs in the entity cache if it is enabled.
	*
	* @param spisok_tovarovs the spisok_tovarovs
	*/
	public void cacheResult(java.util.List<spisok_tovarov> spisok_tovarovs);

	/**
	* Creates a new spisok_tovarov with the primary key. Does not add the spisok_tovarov to the database.
	*
	* @param spisok_tovarov_id the primary key for the new spisok_tovarov
	* @return the new spisok_tovarov
	*/
	public spisok_tovarov create(long spisok_tovarov_id);

	/**
	* Removes the spisok_tovarov with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov that was removed
	* @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	*/
	public spisok_tovarov remove(long spisok_tovarov_id)
		throws NoSuchspisok_tovarovException;

	public spisok_tovarov updateImpl(spisok_tovarov spisok_tovarov);

	/**
	* Returns the spisok_tovarov with the primary key or throws a {@link NoSuchspisok_tovarovException} if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov
	* @throws NoSuchspisok_tovarovException if a spisok_tovarov with the primary key could not be found
	*/
	public spisok_tovarov findByPrimaryKey(long spisok_tovarov_id)
		throws NoSuchspisok_tovarovException;

	/**
	* Returns the spisok_tovarov with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_id the primary key of the spisok_tovarov
	* @return the spisok_tovarov, or <code>null</code> if a spisok_tovarov with the primary key could not be found
	*/
	public spisok_tovarov fetchByPrimaryKey(long spisok_tovarov_id);

	@Override
	public java.util.Map<java.io.Serializable, spisok_tovarov> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the spisok_tovarovs.
	*
	* @return the spisok_tovarovs
	*/
	public java.util.List<spisok_tovarov> findAll();

	/**
	* Returns a range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @return the range of spisok_tovarovs
	*/
	public java.util.List<spisok_tovarov> findAll(int start, int end);

	/**
	* Returns an ordered range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok_tovarovs
	*/
	public java.util.List<spisok_tovarov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_tovarov> orderByComparator);

	/**
	* Returns an ordered range of all the spisok_tovarovs.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarovModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarovs
	* @param end the upper bound of the range of spisok_tovarovs (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok_tovarovs
	*/
	public java.util.List<spisok_tovarov> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_tovarov> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the spisok_tovarovs from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of spisok_tovarovs.
	*
	* @return the number of spisok_tovarovs
	*/
	public int countAll();
}