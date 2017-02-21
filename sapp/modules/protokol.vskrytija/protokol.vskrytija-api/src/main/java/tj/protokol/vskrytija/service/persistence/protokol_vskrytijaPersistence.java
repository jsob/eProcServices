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

package tj.protokol.vskrytija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.protokol.vskrytija.exception.NoSuchprotokol_vskrytijaException;
import tj.protokol.vskrytija.model.protokol_vskrytija;

/**
 * The persistence interface for the protokol_vskrytija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.protokol.vskrytija.service.persistence.impl.protokol_vskrytijaPersistenceImpl
 * @see protokol_vskrytijaUtil
 * @generated
 */
@ProviderType
public interface protokol_vskrytijaPersistence extends BasePersistence<protokol_vskrytija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link protokol_vskrytijaUtil} to access the protokol_vskrytija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the protokol_vskrytija in the entity cache if it is enabled.
	*
	* @param protokol_vskrytija the protokol_vskrytija
	*/
	public void cacheResult(protokol_vskrytija protokol_vskrytija);

	/**
	* Caches the protokol_vskrytijas in the entity cache if it is enabled.
	*
	* @param protokol_vskrytijas the protokol_vskrytijas
	*/
	public void cacheResult(
		java.util.List<protokol_vskrytija> protokol_vskrytijas);

	/**
	* Creates a new protokol_vskrytija with the primary key. Does not add the protokol_vskrytija to the database.
	*
	* @param protokol_vskrytija_id the primary key for the new protokol_vskrytija
	* @return the new protokol_vskrytija
	*/
	public protokol_vskrytija create(long protokol_vskrytija_id);

	/**
	* Removes the protokol_vskrytija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija that was removed
	* @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	*/
	public protokol_vskrytija remove(long protokol_vskrytija_id)
		throws NoSuchprotokol_vskrytijaException;

	public protokol_vskrytija updateImpl(protokol_vskrytija protokol_vskrytija);

	/**
	* Returns the protokol_vskrytija with the primary key or throws a {@link NoSuchprotokol_vskrytijaException} if it could not be found.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija
	* @throws NoSuchprotokol_vskrytijaException if a protokol_vskrytija with the primary key could not be found
	*/
	public protokol_vskrytija findByPrimaryKey(long protokol_vskrytija_id)
		throws NoSuchprotokol_vskrytijaException;

	/**
	* Returns the protokol_vskrytija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param protokol_vskrytija_id the primary key of the protokol_vskrytija
	* @return the protokol_vskrytija, or <code>null</code> if a protokol_vskrytija with the primary key could not be found
	*/
	public protokol_vskrytija fetchByPrimaryKey(long protokol_vskrytija_id);

	@Override
	public java.util.Map<java.io.Serializable, protokol_vskrytija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the protokol_vskrytijas.
	*
	* @return the protokol_vskrytijas
	*/
	public java.util.List<protokol_vskrytija> findAll();

	/**
	* Returns a range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @return the range of protokol_vskrytijas
	*/
	public java.util.List<protokol_vskrytija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of protokol_vskrytijas
	*/
	public java.util.List<protokol_vskrytija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<protokol_vskrytija> orderByComparator);

	/**
	* Returns an ordered range of all the protokol_vskrytijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link protokol_vskrytijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of protokol_vskrytijas
	* @param end the upper bound of the range of protokol_vskrytijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of protokol_vskrytijas
	*/
	public java.util.List<protokol_vskrytija> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<protokol_vskrytija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the protokol_vskrytijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of protokol_vskrytijas.
	*
	* @return the number of protokol_vskrytijas
	*/
	public int countAll();
}