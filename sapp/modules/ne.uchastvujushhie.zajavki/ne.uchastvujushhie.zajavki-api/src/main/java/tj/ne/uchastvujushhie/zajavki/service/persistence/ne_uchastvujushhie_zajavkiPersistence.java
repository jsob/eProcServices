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

package tj.ne.uchastvujushhie.zajavki.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.ne.uchastvujushhie.zajavki.exception.NoSuchne_uchastvujushhie_zajavkiException;
import tj.ne.uchastvujushhie.zajavki.model.ne_uchastvujushhie_zajavki;

/**
 * The persistence interface for the ne_uchastvujushhie_zajavki service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.ne.uchastvujushhie.zajavki.service.persistence.impl.ne_uchastvujushhie_zajavkiPersistenceImpl
 * @see ne_uchastvujushhie_zajavkiUtil
 * @generated
 */
@ProviderType
public interface ne_uchastvujushhie_zajavkiPersistence extends BasePersistence<ne_uchastvujushhie_zajavki> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link ne_uchastvujushhie_zajavkiUtil} to access the ne_uchastvujushhie_zajavki persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the ne_uchastvujushhie_zajavki in the entity cache if it is enabled.
	*
	* @param ne_uchastvujushhie_zajavki the ne_uchastvujushhie_zajavki
	*/
	public void cacheResult(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki);

	/**
	* Caches the ne_uchastvujushhie_zajavkis in the entity cache if it is enabled.
	*
	* @param ne_uchastvujushhie_zajavkis the ne_uchastvujushhie_zajavkis
	*/
	public void cacheResult(
		java.util.List<ne_uchastvujushhie_zajavki> ne_uchastvujushhie_zajavkis);

	/**
	* Creates a new ne_uchastvujushhie_zajavki with the primary key. Does not add the ne_uchastvujushhie_zajavki to the database.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key for the new ne_uchastvujushhie_zajavki
	* @return the new ne_uchastvujushhie_zajavki
	*/
	public ne_uchastvujushhie_zajavki create(long ne_uchastvujushhie_zajavki_id);

	/**
	* Removes the ne_uchastvujushhie_zajavki with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki that was removed
	* @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public ne_uchastvujushhie_zajavki remove(long ne_uchastvujushhie_zajavki_id)
		throws NoSuchne_uchastvujushhie_zajavkiException;

	public ne_uchastvujushhie_zajavki updateImpl(
		ne_uchastvujushhie_zajavki ne_uchastvujushhie_zajavki);

	/**
	* Returns the ne_uchastvujushhie_zajavki with the primary key or throws a {@link NoSuchne_uchastvujushhie_zajavkiException} if it could not be found.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki
	* @throws NoSuchne_uchastvujushhie_zajavkiException if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public ne_uchastvujushhie_zajavki findByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id)
		throws NoSuchne_uchastvujushhie_zajavkiException;

	/**
	* Returns the ne_uchastvujushhie_zajavki with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param ne_uchastvujushhie_zajavki_id the primary key of the ne_uchastvujushhie_zajavki
	* @return the ne_uchastvujushhie_zajavki, or <code>null</code> if a ne_uchastvujushhie_zajavki with the primary key could not be found
	*/
	public ne_uchastvujushhie_zajavki fetchByPrimaryKey(
		long ne_uchastvujushhie_zajavki_id);

	@Override
	public java.util.Map<java.io.Serializable, ne_uchastvujushhie_zajavki> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the ne_uchastvujushhie_zajavkis.
	*
	* @return the ne_uchastvujushhie_zajavkis
	*/
	public java.util.List<ne_uchastvujushhie_zajavki> findAll();

	/**
	* Returns a range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @return the range of ne_uchastvujushhie_zajavkis
	*/
	public java.util.List<ne_uchastvujushhie_zajavki> findAll(int start, int end);

	/**
	* Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of ne_uchastvujushhie_zajavkis
	*/
	public java.util.List<ne_uchastvujushhie_zajavki> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator);

	/**
	* Returns an ordered range of all the ne_uchastvujushhie_zajavkis.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link ne_uchastvujushhie_zajavkiModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of ne_uchastvujushhie_zajavkis
	* @param end the upper bound of the range of ne_uchastvujushhie_zajavkis (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of ne_uchastvujushhie_zajavkis
	*/
	public java.util.List<ne_uchastvujushhie_zajavki> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<ne_uchastvujushhie_zajavki> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the ne_uchastvujushhie_zajavkis from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of ne_uchastvujushhie_zajavkis.
	*
	* @return the number of ne_uchastvujushhie_zajavkis
	*/
	public int countAll();
}