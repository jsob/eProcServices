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

package tj.porjadok.raboty.komissii.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.porjadok.raboty.komissii.exception.NoSuchporjadok_raboty_komissiiException;
import tj.porjadok.raboty.komissii.model.porjadok_raboty_komissii;

/**
 * The persistence interface for the porjadok_raboty_komissii service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.porjadok.raboty.komissii.service.persistence.impl.porjadok_raboty_komissiiPersistenceImpl
 * @see porjadok_raboty_komissiiUtil
 * @generated
 */
@ProviderType
public interface porjadok_raboty_komissiiPersistence extends BasePersistence<porjadok_raboty_komissii> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link porjadok_raboty_komissiiUtil} to access the porjadok_raboty_komissii persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the porjadok_raboty_komissii in the entity cache if it is enabled.
	*
	* @param porjadok_raboty_komissii the porjadok_raboty_komissii
	*/
	public void cacheResult(porjadok_raboty_komissii porjadok_raboty_komissii);

	/**
	* Caches the porjadok_raboty_komissiis in the entity cache if it is enabled.
	*
	* @param porjadok_raboty_komissiis the porjadok_raboty_komissiis
	*/
	public void cacheResult(
		java.util.List<porjadok_raboty_komissii> porjadok_raboty_komissiis);

	/**
	* Creates a new porjadok_raboty_komissii with the primary key. Does not add the porjadok_raboty_komissii to the database.
	*
	* @param porjadok_raboty_komissii_id the primary key for the new porjadok_raboty_komissii
	* @return the new porjadok_raboty_komissii
	*/
	public porjadok_raboty_komissii create(long porjadok_raboty_komissii_id);

	/**
	* Removes the porjadok_raboty_komissii with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii that was removed
	* @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public porjadok_raboty_komissii remove(long porjadok_raboty_komissii_id)
		throws NoSuchporjadok_raboty_komissiiException;

	public porjadok_raboty_komissii updateImpl(
		porjadok_raboty_komissii porjadok_raboty_komissii);

	/**
	* Returns the porjadok_raboty_komissii with the primary key or throws a {@link NoSuchporjadok_raboty_komissiiException} if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii
	* @throws NoSuchporjadok_raboty_komissiiException if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public porjadok_raboty_komissii findByPrimaryKey(
		long porjadok_raboty_komissii_id)
		throws NoSuchporjadok_raboty_komissiiException;

	/**
	* Returns the porjadok_raboty_komissii with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param porjadok_raboty_komissii_id the primary key of the porjadok_raboty_komissii
	* @return the porjadok_raboty_komissii, or <code>null</code> if a porjadok_raboty_komissii with the primary key could not be found
	*/
	public porjadok_raboty_komissii fetchByPrimaryKey(
		long porjadok_raboty_komissii_id);

	@Override
	public java.util.Map<java.io.Serializable, porjadok_raboty_komissii> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the porjadok_raboty_komissiis.
	*
	* @return the porjadok_raboty_komissiis
	*/
	public java.util.List<porjadok_raboty_komissii> findAll();

	/**
	* Returns a range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @return the range of porjadok_raboty_komissiis
	*/
	public java.util.List<porjadok_raboty_komissii> findAll(int start, int end);

	/**
	* Returns an ordered range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of porjadok_raboty_komissiis
	*/
	public java.util.List<porjadok_raboty_komissii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<porjadok_raboty_komissii> orderByComparator);

	/**
	* Returns an ordered range of all the porjadok_raboty_komissiis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link porjadok_raboty_komissiiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of porjadok_raboty_komissiis
	* @param end the upper bound of the range of porjadok_raboty_komissiis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of porjadok_raboty_komissiis
	*/
	public java.util.List<porjadok_raboty_komissii> findAll(int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<porjadok_raboty_komissii> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the porjadok_raboty_komissiis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of porjadok_raboty_komissiis.
	*
	* @return the number of porjadok_raboty_komissiis
	*/
	public int countAll();
}