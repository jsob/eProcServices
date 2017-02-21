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

package tj.istochnik.finansirovanija.service.persistence;

import aQute.bnd.annotation.ProviderType;

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import tj.istochnik.finansirovanija.exception.NoSuchistochnik_finansirovanijaException;
import tj.istochnik.finansirovanija.model.istochnik_finansirovanija;

/**
 * The persistence interface for the istochnik_finansirovanija service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see tj.istochnik.finansirovanija.service.persistence.impl.istochnik_finansirovanijaPersistenceImpl
 * @see istochnik_finansirovanijaUtil
 * @generated
 */
@ProviderType
public interface istochnik_finansirovanijaPersistence extends BasePersistence<istochnik_finansirovanija> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link istochnik_finansirovanijaUtil} to access the istochnik_finansirovanija persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Caches the istochnik_finansirovanija in the entity cache if it is enabled.
	*
	* @param istochnik_finansirovanija the istochnik_finansirovanija
	*/
	public void cacheResult(istochnik_finansirovanija istochnik_finansirovanija);

	/**
	* Caches the istochnik_finansirovanijas in the entity cache if it is enabled.
	*
	* @param istochnik_finansirovanijas the istochnik_finansirovanijas
	*/
	public void cacheResult(
		java.util.List<istochnik_finansirovanija> istochnik_finansirovanijas);

	/**
	* Creates a new istochnik_finansirovanija with the primary key. Does not add the istochnik_finansirovanija to the database.
	*
	* @param istochnik_finansirovanija_id the primary key for the new istochnik_finansirovanija
	* @return the new istochnik_finansirovanija
	*/
	public istochnik_finansirovanija create(long istochnik_finansirovanija_id);

	/**
	* Removes the istochnik_finansirovanija with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija that was removed
	* @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	*/
	public istochnik_finansirovanija remove(long istochnik_finansirovanija_id)
		throws NoSuchistochnik_finansirovanijaException;

	public istochnik_finansirovanija updateImpl(
		istochnik_finansirovanija istochnik_finansirovanija);

	/**
	* Returns the istochnik_finansirovanija with the primary key or throws a {@link NoSuchistochnik_finansirovanijaException} if it could not be found.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija
	* @throws NoSuchistochnik_finansirovanijaException if a istochnik_finansirovanija with the primary key could not be found
	*/
	public istochnik_finansirovanija findByPrimaryKey(
		long istochnik_finansirovanija_id)
		throws NoSuchistochnik_finansirovanijaException;

	/**
	* Returns the istochnik_finansirovanija with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param istochnik_finansirovanija_id the primary key of the istochnik_finansirovanija
	* @return the istochnik_finansirovanija, or <code>null</code> if a istochnik_finansirovanija with the primary key could not be found
	*/
	public istochnik_finansirovanija fetchByPrimaryKey(
		long istochnik_finansirovanija_id);

	@Override
	public java.util.Map<java.io.Serializable, istochnik_finansirovanija> fetchByPrimaryKeys(
		java.util.Set<java.io.Serializable> primaryKeys);

	/**
	* Returns all the istochnik_finansirovanijas.
	*
	* @return the istochnik_finansirovanijas
	*/
	public java.util.List<istochnik_finansirovanija> findAll();

	/**
	* Returns a range of all the istochnik_finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik_finansirovanijas
	* @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	* @return the range of istochnik_finansirovanijas
	*/
	public java.util.List<istochnik_finansirovanija> findAll(int start, int end);

	/**
	* Returns an ordered range of all the istochnik_finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik_finansirovanijas
	* @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of istochnik_finansirovanijas
	*/
	public java.util.List<istochnik_finansirovanija> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<istochnik_finansirovanija> orderByComparator);

	/**
	* Returns an ordered range of all the istochnik_finansirovanijas.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link istochnik_finansirovanijaModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of istochnik_finansirovanijas
	* @param end the upper bound of the range of istochnik_finansirovanijas (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @param retrieveFromCache whether to retrieve from the finder cache
	* @return the ordered range of istochnik_finansirovanijas
	*/
	public java.util.List<istochnik_finansirovanija> findAll(int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<istochnik_finansirovanija> orderByComparator,
		boolean retrieveFromCache);

	/**
	* Removes all the istochnik_finansirovanijas from the database.
	*/
	public void removeAll();

	/**
	* Returns the number of istochnik_finansirovanijas.
	*
	* @return the number of istochnik_finansirovanijas
	*/
	public int countAll();
}