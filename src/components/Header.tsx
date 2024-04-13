import React from 'react';
import { NavLink } from 'react-router-dom';
import classNames from 'classnames';

const getLinkClass = ({ isActive }: { isActive: boolean }) => classNames(
  'nav-link hover:text-green-500', { 'text-green-500': isActive },
);

export const Header = () => (
  <header className="bg-gray-800 text-white p-4">
    <div className="mx-auto flex justify-between items-center">
      <NavLink to="/" className="text-2xl font-bold">Connect Cafe</NavLink>
      <nav className="space-x-4">
        <NavLink to="/main" className={getLinkClass}>Main Page</NavLink>
        <NavLink to="/cafes" className={getLinkClass}>Cafe List</NavLink>
        <NavLink to="/login" className="nav-link border border-green-500 text-green-500 px-4 py-2 rounded-md transition duration-300 ease-in-out hover:bg-green-500 hover:text-white">Log In</NavLink>
      </nav>
    </div>
  </header>
);
