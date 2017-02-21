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

package tj.obwaja.informacija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.obwaja.informacija.exception.NoSuchobwaja_informacijaException;
import tj.obwaja.informacija.model.obwaja_informacija;

/**
 * The persistence interface for the obwaja_informacija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.obwaja.informacija.service.persistence.impl.obwaja_informacijaPersistenceImpl
 * @see obwaja_informacijaUtil
 * @generated
 */
@ProviderType
public interface obwaja_informacijaPersistence extends BasePersistence<obwaja_informacija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link obwaja_informacijaUtil} to access the obwaja_informacija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the obwaja_informacija in the entity cache if it is enabled.
	*
	* @param obwaja_informacija the obwaja_informacija
	*/
	public void cacheResult(obwaja_informacija obwaja_informacija);

	/**
	* Caches the obwaja_informacijas in the entity cache if it is enabled.
	*
	* @param obwaja_informacijas the obwaja_informacijas
	*/
	public void cacheResult(
		java.util.List<obwaja_informacija> obwaja_informacijas);

	/**
	* Creates a new obwaja_informacija with the primary key. Does not add the obwaja_informacija to the database.
	*
	* @param obwaja_informacija_id the primary key for the new obwaja_informacija
	* @return the new obwaja_informacija
	*/
	public obwaja_informacija create(long obwaja_informacija_id);

	/**
	* Removes the obwaja_informacija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija that was removed
	* @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	*/
	public obwaja_informacija remove(long obwaja_informacija_id)
		throws NoSuchobwaja_informacijaException;

	public obwaja_informacija updateImpl(obwaja_informacija obwaja_informacija);

	/**
	* Returns the obwaja_informacija with the primary key or throws a {@link NoSuchobwaja_informacijaException} if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija
	* @throws NoSuchobwaja_informacijaException if a obwaja_informacija with the primary key could not be found
	*/
	public obwaja_informacija findByPrimaryKey(long obwaja_informacija_id)
		throws NoSuchobwaja_informacijaException;

	/**
	* Returns the obwaja_informacija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param obwaja_informacija_id the primary key of the obwaja_informacija
	* @return the obwaja_informacija, or <code>null</code> if a obwaja_informacija with the primary key could not be found
	*/
	public obwaja_informacija fetchByPrimaryKey(long obwaja_informacija_id);

	@Override
	public java.util.Map<java.io.Serializable, obwaja_informacija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the obwaja_informacijas.
	*
	* @return the obwaja_informacijas
	*/
	public java.util.List<obwaja_informacija> findAll();

	/**
	* Returns a range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @return the range of obwaja_informacijas
	*/
	public java.util.List<obwaja_informacija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of obwaja_informacijas
	*/
	public java.util.List<obwaja_informacija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<obwaja_informacija> orderByComparator);

	/**
	* Returns an ordered range of all the obwaja_informacijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link obwaja_informacijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of obwaja_informacijas
	* @param end the upper bound of the range of obwaja_informacijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of obwaja_informacijas
	*/
	public java.util.List<obwaja_informacija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<obwaja_informacija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the obwaja_informacijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of obwaja_informacijas.
	*
	* @return the number of obwaja_informacijas
	*/
	public int countAll();
}