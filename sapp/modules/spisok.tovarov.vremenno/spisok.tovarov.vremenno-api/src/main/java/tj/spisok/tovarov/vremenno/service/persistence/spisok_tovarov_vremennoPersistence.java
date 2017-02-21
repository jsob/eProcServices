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

package tj.spisok.tovarov.vremenno.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.spisok.tovarov.vremenno.exception.NoSuchspisok_tovarov_vremennoException;
import tj.spisok.tovarov.vremenno.model.spisok_tovarov_vremenno;

/**
 * The persistence interface for the spisok_tovarov_vremenno service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.spisok.tovarov.vremenno.service.persistence.impl.spisok_tovarov_vremennoPersistenceImpl
 * @see spisok_tovarov_vremennoUtil
 * @generated
 */
@ProviderType
public interface spisok_tovarov_vremennoPersistence extends BasePersistence<spisok_tovarov_vremenno> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link spisok_tovarov_vremennoUtil} to access the spisok_tovarov_vremenno persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the spisok_tovarov_vremenno in the entity cache if it is enabled.
	*
	* @param spisok_tovarov_vremenno the spisok_tovarov_vremenno
	*/
	public void cacheResult(spisok_tovarov_vremenno spisok_tovarov_vremenno);

	/**
	* Caches the spisok_tovarov_vremennos in the entity cache if it is enabled.
	*
	* @param spisok_tovarov_vremennos the spisok_tovarov_vremennos
	*/
	public void cacheResult(
		java.util.List<spisok_tovarov_vremenno> spisok_tovarov_vremennos);

	/**
	* Creates a new spisok_tovarov_vremenno with the primary key. Does not add the spisok_tovarov_vremenno to the database.
	*
	* @param spisok_tovarov_vremenno_id the primary key for the new spisok_tovarov_vremenno
	* @return the new spisok_tovarov_vremenno
	*/
	public spisok_tovarov_vremenno create(long spisok_tovarov_vremenno_id);

	/**
	* Removes the spisok_tovarov_vremenno with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno that was removed
	* @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public spisok_tovarov_vremenno remove(long spisok_tovarov_vremenno_id)
		throws NoSuchspisok_tovarov_vremennoException;

	public spisok_tovarov_vremenno updateImpl(
		spisok_tovarov_vremenno spisok_tovarov_vremenno);

	/**
	* Returns the spisok_tovarov_vremenno with the primary key or throws a {@link NoSuchspisok_tovarov_vremennoException} if it could not be found.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno
	* @throws NoSuchspisok_tovarov_vremennoException if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public spisok_tovarov_vremenno findByPrimaryKey(
		long spisok_tovarov_vremenno_id)
		throws NoSuchspisok_tovarov_vremennoException;

	/**
	* Returns the spisok_tovarov_vremenno with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param spisok_tovarov_vremenno_id the primary key of the spisok_tovarov_vremenno
	* @return the spisok_tovarov_vremenno, or <code>null</code> if a spisok_tovarov_vremenno with the primary key could not be found
	*/
	public spisok_tovarov_vremenno fetchByPrimaryKey(
		long spisok_tovarov_vremenno_id);

	@Override
	public java.util.Map<java.io.Serializable, spisok_tovarov_vremenno> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the spisok_tovarov_vremennos.
	*
	* @return the spisok_tovarov_vremennos
	*/
	public java.util.List<spisok_tovarov_vremenno> findAll();

	/**
	* Returns a range of all the spisok_tovarov_vremennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarov_vremennos
	* @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	* @return the range of spisok_tovarov_vremennos
	*/
	public java.util.List<spisok_tovarov_vremenno> findAll(int start, int end);

	/**
	* Returns an ordered range of all the spisok_tovarov_vremennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarov_vremennos
	* @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of spisok_tovarov_vremennos
	*/
	public java.util.List<spisok_tovarov_vremenno> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_tovarov_vremenno> orderByComparator);

	/**
	* Returns an ordered range of all the spisok_tovarov_vremennos.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link spisok_tovarov_vremennoModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of spisok_tovarov_vremennos
	* @param end the upper bound of the range of spisok_tovarov_vremennos (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of spisok_tovarov_vremennos
	*/
	public java.util.List<spisok_tovarov_vremenno> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<spisok_tovarov_vremenno> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the spisok_tovarov_vremennos from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of spisok_tovarov_vremennos.
	*
	* @return the number of spisok_tovarov_vremennos
	*/
	public int countAll();
}